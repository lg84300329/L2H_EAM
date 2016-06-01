package com.l2h.eam.utils.domain;

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
 * 包名     ：com.l2h.eam.utils.domain
 * 创建人   ：l2h
 * 创建时间 ：2016-05-31
 * 功能说明 ：普通树节点
 */
public class TreeNode {
    private Integer node_id;//树节点id
    private Integer parentID;//树节点父id
    private String node_name;//树节点名称
    private List<TreeNode> childrens = new ArrayList<TreeNode>();

    /**
     * 函数说明：添加子节点
     * @param child
     */

    public void addChild(TreeNode child){
        childrens.add(child);
    }


    public void  sortChildren()
    {
        Collections.sort(childrens, new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {//id大的在后面
                if (o1.node_id > o2.node_id) {
                    return -1;
                } else if (o1.node_id < o2.node_id) {
                    return 1;
                }
                return 0;
            }
        });
        for (Iterator<TreeNode> iterator= childrens.iterator();iterator.hasNext();)
        {
            iterator.next().sortChildren();
        }

    }


    public Integer getNode_id() {
        return node_id;
    }

    public void setNode_id(Integer node_id) {
        this.node_id = node_id;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public List<TreeNode> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<TreeNode> childrens) {
        this.childrens = childrens;
    }
}
