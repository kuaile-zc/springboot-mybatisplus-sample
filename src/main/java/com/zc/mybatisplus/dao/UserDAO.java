package com.zc.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zc.mybatisplus.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author CoreyChen Zhang
 * @version 2020/7/31 17:13
 * @modified
 */
@Repository
public interface UserDAO extends BaseMapper<User> {
}
