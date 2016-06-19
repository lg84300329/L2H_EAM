package com.l2h.eam.sys.controller;

import com.l2h.eam.sys.domain.User;
import com.l2h.eam.sys.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
 * 功能说明 ：用户登录controller
 */
@Controller
@SessionAttributes("userInfo")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping( value="login.do",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("account") String account,@RequestParam("password")String password, ModelMap userInfo)
    {
        User user = loginService.login(account,password);

        ModelAndView view = new ModelAndView();

        if (user!=null)
        {
            view.setViewName("common/main");
            //用户信息验证成功后，把用户信息存储在sessionAttribute中
            userInfo.addAttribute("userInfo",user);

        }
        else
        {
            view.setViewName("common/login");
            view.addObject("errorMsg","用户名与密码不一致");
        }

        return view;

    }
    @RequestMapping(value="index.do",method = RequestMethod.GET)
    public String defaultLogin()
    {
          return "common/login";
    }
    public String test(String ri)
    {
        return "ddd:"+ri;
    }
}
