package com.l2h.eam.sys.service;


import com.l2h.eam.sys.mapper.UserMapper;
import com.l2h.eam.sys.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
 * 创建时间 ：2016-05-29
 * 功能说明 ：User操作业务逻辑
 */
@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 函数说明：新增一个用户
     * @param user
     */

    public void insertUser(User user)
    {
        userMapper.insertUser(user);
    }

    /**
     * 函数说明：更新一个用户
     * @param user
     */
    public void updateUser(User user) { userMapper.updateUser(user);}

    /**
     * 函数说明：根据登录账号获取用户
     * @param account
     * @return
     */
    public User selectUserByAccount(String account)
    {
       return userMapper.selectUserByAccount(account);
    }
    public List<User> getUsersByPost(String post_code)
    {
        return  userMapper.getUsersByPost(post_code);
    }


}
