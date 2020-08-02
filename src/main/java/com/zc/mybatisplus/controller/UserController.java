package com.zc.mybatisplus.controller;

import com.zc.mybatisplus.dao.UserDAO;
import com.zc.mybatisplus.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @author: Corey Zhang
 * @modified:
 * @version: 2020-08-02 15:25
 */
@RestController
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        List<User> users = userDAO.selectList(null);
        return users;
    }
}
