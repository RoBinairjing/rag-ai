package com.jing.ragaiback.service;

import com.jing.ragaiback.common.PageResult;
import com.jing.ragaiback.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jing.ragaiback.pojo.dto.UserDTO;
import com.jing.ragaiback.pojo.dto.UserPageQueryDTO;

import javax.security.auth.login.AccountLockedException;
import javax.security.auth.login.AccountNotFoundException;

/**
* @author jing
* @description 针对表【user】的数据库操作Service
* @createDate 2025-02-14 21:05:04
*/
public interface UserService extends IService<User> {

    User login(String userName, String password) throws AccountNotFoundException, AccountLockedException;

    void saveUser(UserDTO userDTO);

    PageResult pageQuery(UserPageQueryDTO userPageQueryDTO);

    void startOrStop(Integer status, Integer id);

    void updateUser(UserDTO userDTO);

    void register(User user);

    boolean getByUsername(String userName);
}
