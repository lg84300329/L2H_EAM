package com.l2h.eam.utils.common;
import com.alibaba.fastjson.JSON;
import com.l2h.eam.utils.domain.TreeNode;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * 项目名称 ：L2H_EAM
 * 包名     ：com.l2h.eam.utils.common
 * 创建人   ：l2h
 * 创建时间 ：2016-06-01
 * 功能说明 ：树生成器
 */

public class TreeGenerator {

    // 将结果集存入散列表（后面将借助散列表构造多叉树）
     static  Logger logger = Logger.getLogger(TreeGenerator.class);

    /**
     *  树生成过程
     *  1 把所有节点存入HashMap中，KEY是节点ID,VALUE 是节点本身
     *  2 遍历Map,如果当前节点找到父节点就在map中找到它的父节点并加入children中
     *  3 如果是根节点就加入根节点list（根节点判断 1：ParentID为空 2 ID与ParentID相等 3 找不到父节点）
     * @param treeNodes 节点集合
     * @param comparator 排序规则
     * @return 树列表
     */
    public static List<TreeNode> generateTree(List<TreeNode> treeNodes,Comparator<TreeNode> comparator)
    {
        List<TreeNode> roots = new ArrayList<TreeNode>();//树的所有根
        // 节点列表（散列表，用于临时存储节点对象）
        HashMap<Integer,TreeNode> nodeMap = new HashMap<Integer,TreeNode> ();
        for (Iterator<TreeNode> iterator = treeNodes.iterator();iterator.hasNext();)
        {
            TreeNode node = iterator.next();
            nodeMap.put(node.getNode_id(),node);
        }

        // 构造无序的多叉树
        Set entrySet = nodeMap.entrySet();


        for (Iterator it = entrySet.iterator(); it.hasNext();)
        {
            TreeNode node = (TreeNode) ((Map.Entry) it.next()).getValue();
            //当前节点不等于父节点（根节点的ID可能设置为它本身）

            if( !(node.getNode_id().equals(node.getParentID()))&&(nodeMap.get(node.getParentID())!=null))
            {
                nodeMap.get(node.getParentID()).addChild(node);
            }
            else
            {
                roots.add(node);
            }

        }
        if (comparator!=null)
        {
            logger.debug("roots size:"+roots.size());
            for (Iterator<TreeNode> iterator= roots.iterator();iterator.hasNext();)
            {

                TreeNode node =  iterator.next();
                logger.debug("node id:"+node.getNode_id());
                if(node!=null&&node.getChildrensSize()>1)
                {
                    node.sortChildren(comparator);
                }

            }
        }
        return   roots;
    }
    /**
     *  树生成过程
     *  1 把所有节点存入HashMap中，KEY是节点ID,VALUE 是节点本身
     *  2 遍历Map,如果当前节点找到父节点就在map中找到它的父节点并加入children中
     *  3 如果是根节点就加入根节点list（根节点判断 1：ParentID为空 2 ID与ParentID相等 3 找不到父节点）
     *  4 转换成json
     * @param treeNodes 节点集合
     * @param comparator 排序方式
     * @return 树列表所生成的json
     */
    public static String generateTreeJson(List<TreeNode> treeNodes,Comparator<TreeNode> comparator)
    {
        List<TreeNode> list = generateTree(treeNodes, comparator);

        return JSON.toJSONString(list);
    }
    /**
     *  树生成过程
     *  1 把所有节点存入HashMap中，KEY是节点ID,VALUE 是节点本身
     *  2 遍历Map,如果当前节点找到父节点就在map中找到它的父节点并加入children中
     *  3 如果是根节点就加入根节点list（根节点判断 1：ParentID为空 2 ID与ParentID相等 3 找不到父节点）
     *  4 转换成json
     * @param treeNodes 节点集合
     * @return 树列表所生成的json
     */
    public static String generateTreeJson(List<TreeNode> treeNodes)
    {
        return JSON.toJSONString(generateTree(treeNodes, null));
    }
}
