package com.zc.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zc.mybatisplus.entity.StudentInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author: Corey Zhang
 * @modified:
 * @version: 2020-08-01 12:20
 */
@Repository
public interface StudentInfoDAO extends BaseMapper<StudentInfo> {
}
