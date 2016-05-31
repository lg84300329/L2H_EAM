package com.l2h.eam.sys.mapper;

import com.l2h.eam.sys.domain.User;
import org.apache.ibatis.annotations.Flush;

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
 * 包名     ：com.l2h.eam.sys.mapper
 * 创建人   ：l2h
 * 创建时间 ：2016-05-29
 * 功能说明 ： 用户DAO
 */

public interface UserMapper {

    /**
     * 函数说明：根据用户ID查找用户
     * @param id 用户ID
     * @return
     */
    User selectUserByID(int id );

    /**
     * 函数说明：根据用户登录账号查找用户
     * @param account 用户登录账号
     * @return
     */

    User selectUserByAccount(String account);

    /**
     * 函数说明：删除用户
     * @return
     */
    void   deleteUser(User user);

    /**
     * 函数说明：更新用户
     * @param user
     */

    void updateUser(User user);

    /**
     * 函数说明：新增用户
     * @param user
     */

    void insertUser(User user);
    /**
     * 函数说明：根据岗位ID加载用户
     */
    List<User> getUsersByPost(String post_code);

}
