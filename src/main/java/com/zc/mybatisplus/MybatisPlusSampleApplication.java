package com.zc.mybatisplus;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author CoreyChen Zhang
 * @version 2020/7/31 15:47
 * @modified
 */
@SpringBootApplication
@MapperScan("com.zc.mybatisplus.dao")
public class MybatisPlusSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusSampleApplication.class);
    }
}
