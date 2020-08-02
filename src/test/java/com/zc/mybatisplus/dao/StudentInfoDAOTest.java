package com.zc.mybatisplus.dao;

import com.zc.mybatisplus.entity.StudentInfo;
import com.zc.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Description:
 *
 * @author: Corey Zhang
 * @modified:
 * @version: 2020-08-01 11:17
 */
@SpringBootTest
public class StudentInfoDAOTest {

    @Autowired
    private StudentInfoDAO studentInfoDAO;

    @Test
    public void SelectAll(){
        List<StudentInfo> users = studentInfoDAO.selectList(null);
        users.stream().forEach(user -> System.out.println(user));
    }
}
