package com.zc.mybatisplus.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zc.mybatisplus.entity.User;
import com.zc.mybatisplus.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

/**
 * Description:
 *
 * @author: Corey Zhang
 * @modified:
 * @version: 2020-08-01 11:17
 */
@SpringBootTest
public class UserDAOTest {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void SelectAll(){
        List<User> users = userDAO.selectList(null);
        users.stream().forEach(user -> System.out.println(user));
    }

    @Test
    public void SelectById(){
        User user = userDAO.selectById("2");
        System.out.println(user);
    }

    @Test
    public void SelectByCondition(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("age", 24);

        List<User> users = userDAO.selectList(queryWrapper);
        users.stream().forEach(user -> System.out.println(user));

    }

    @Test
    public void Save(){
        User user = new User(100, "in", 97, new Date());
        userDAO.insert(user);

    }

    @Test
    public void Delete(){
        userDAO.deleteById(100);
    }



    @Test
    public void FindPage(){
//        PageHelper.startPage(1,2);
//        List<User> users = userService.getBaseMapper().selectList(null);
//        users.stream().forEach(user -> System.out.println(user));

    }
}
