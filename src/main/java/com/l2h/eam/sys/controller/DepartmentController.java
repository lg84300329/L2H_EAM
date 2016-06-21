package com.l2h.eam.sys.controller;

import com.l2h.eam.sys.domain.User;
import com.l2h.eam.sys.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
 * 包名     ：com.l2h.eam.sys.controller
 * 创建人   ：l2h
 * 创建时间 ：2016-06-20
 * 功能说明 ：部门controller
 */
@Controller
@SessionAttributes("userInfo")
public class DepartmentController  {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(method = RequestMethod.POST,value = "sys/deparment/getDepts")
    @ResponseBody
    public String getDpetsTreeJson(@ModelAttribute("userInfo")User user)
    {
       return departmentService.getDpetsTreeJson("");
    }

}
