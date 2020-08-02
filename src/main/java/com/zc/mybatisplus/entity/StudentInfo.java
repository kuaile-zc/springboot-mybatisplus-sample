package com.zc.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.ToString;

/**
 * Description:
 *
 * @author: Corey Zhang
 * @modified:
 * @version: 2020-08-01 12:19
 */
@Data
@ToString
public class StudentInfo {

    private Integer id;
    @TableField(value = "name3")
    private String name;
    private Integer age;

    @TableField(exist = false)
    private String notData;
}
