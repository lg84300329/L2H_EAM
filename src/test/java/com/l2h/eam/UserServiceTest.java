package com.l2h.eam;

import com.l2h.eam.sys.domain.User;
import com.l2h.eam.sys.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
 * 包名     ：com.l2h.eam
 * 创建人   ：l2h
 * 创建时间 ：2016-05-30
 * 功能说明 ：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mvc-dispatcher-servlet.xml")
public class UserServiceTest  extends AbstractJUnit4SpringContextTests {

    @Autowired
    UserService service;

    public void addUser() {
        User user = new User();
        user.setAccount("84300329@qq.com");
        user.setPassword("123456");
        user.setUser_name("l2h");
        service.insertUser(user);
    }

    @Test
    public void selectUser() {
        org.apache.ibatis.logging.LogFactory.useLog4JLogging();
        User user = service.selectUserByAccount("80515024");

    }
    @Test
    public  void updateUser()
    {
        User user = new User();
        user.setAccount("84300329@qq.com");
        user.setPassword("");
        user.setUser_id(1);
        service.updateUser(user);

    }
}
