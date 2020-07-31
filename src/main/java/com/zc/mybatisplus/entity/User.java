package com.zc.mybatisplus.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author CoreyChen Zhang
 * @version 2020/7/31 16:40
 * @modified
 */
@Data
@ToString
public class User {

    private String id;
    private String name;
    private Integer age;
    private Date bir;

}
