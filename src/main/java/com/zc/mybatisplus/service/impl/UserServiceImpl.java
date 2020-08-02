package com.zc.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.mybatisplus.dao.UserDAO;
import com.zc.mybatisplus.entity.User;
import com.zc.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author: Corey Zhang
 * @modified:
 * @version: 2020-08-02 20:28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDAO, User> implements UserService {
}
