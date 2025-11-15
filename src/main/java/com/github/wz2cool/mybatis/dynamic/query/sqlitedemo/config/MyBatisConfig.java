package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.config;


import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.mapper")
public class MyBatisConfig {
    // 配置类，通过@MapperScan自动扫描Mapper接口
}