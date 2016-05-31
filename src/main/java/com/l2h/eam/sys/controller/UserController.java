package com.l2h.eam.sys.controller;

import com.l2h.eam.sys.domain.User;
import com.l2h.eam.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016-05-29.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
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
}
