package com.l2h.eam.sys.service;

import com.l2h.eam.sys.mapper.DepartmentMapper;
import com.l2h.eam.utils.common.NodeComparator;
import com.l2h.eam.utils.common.TreeGenerator;
import com.l2h.eam.utils.domain.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
 * 包名     ：com.l2h.eam.sys.service
 * 创建人   ：l2h
 * 创建时间 ：2016-06-01
 * 功能说明 ：
 */
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper  departmentMapper;

    /**
     * 加载本部门及下属所有部门
     * @param dpet_code
     * @return
     */
    public List<TreeNode> getDpetsByLike(String dpet_code)
    {
        return departmentMapper.getDpetsByLike(dpet_code);
    }

    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    /**
     * 加载本部门及下属所有部门生成tree树结构，并把树结构转换成json字符串
     * @param dpet_code
     * @return
     */
    public String getDpetsTreeJson(String dpet_code)
    {
        List<TreeNode> list = getDpetsByLike(dpet_code);
        if (list.size()>0)
        {
            return TreeGenerator.generateTreeJson(list,new NodeComparator());
        }

        return "";
    }
}
