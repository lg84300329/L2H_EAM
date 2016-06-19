package com.l2h.eam.sys.service;

import com.l2h.eam.sys.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
 * 创建时间 ：2016-06-05
 * 功能说明 ：
 */
@Service
public class LoginService {
    @Autowired
    UserService userService;
    @Autowired
    DepartmentService departmentService;
    /**
     * 函数说明：根据登录账号和密码是否正确，如果正确返回当前用的信息
     * @return
     */
     public User login(String account,String password)
     {



         User user =   userService.selectUserByAccount(account);//查询这个账号对应的用户信息

         if(user!=null)
         {
             if (user.getPassword().equals(password))
             {
                 return user;
             }
         }
         return  null;

     }
}
