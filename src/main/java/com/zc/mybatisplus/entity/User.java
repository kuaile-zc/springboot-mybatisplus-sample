package com.zc.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author CoreyChen Zhang
 * @version 2020/7/31 16:40
 * @modified
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "User")
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private Date bir;

}
