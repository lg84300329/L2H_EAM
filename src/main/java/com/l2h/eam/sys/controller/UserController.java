package com.l2h.eam.sys.controller;

import com.l2h.eam.sys.domain.User;
import com.l2h.eam.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

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
 * 创建时间 ：2016-06-05
 * 功能说明 ：用户管理controller
 */
@Controller
@SessionAttributes("userInfo")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.GET,path = "/getUser")
    public String getUserByAccout(ModelMap modelMap,String account)
    {
        User user = new User();
        user.setAccount("84300329@qq.com");
        user.setPassword("123456");
        user.setUser_name("l2h");
        userService.insertUser(user);
        return "hello";
    }

    /**
     * 函数说明：返回用户管理页面
     * @param user session中保存的当前用户信息
     * @return
     */
    @RequestMapping(value = "sys/user/userMsgPage.do")
    public  String getUserManagerPage(@ModelAttribute("userInfo") User user)
    {
         User user1 = user;
        String name = user1.getUser_name();
         return "sys/sys_usermanager";

    }
}
