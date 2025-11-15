package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Hello World API")
public class HelloController {
    
    @Value("${app.hello.message:Hello World!}")
    private String helloMessage;
    
    @Value("${app.name:My Application}")
    private String appName;
    
    @GetMapping("/")
    @ApiOperation(value = "获取完整问候信息", notes = "返回包含应用名称的完整问候信息")
    public String hello() {
        return helloMessage + " - " + appName;
    }
    
    @GetMapping("/hello")
    @ApiOperation(value = "获取简单Hello World", notes = "返回简单的Hello World消息")
    public String helloWorld() {
        return helloMessage;
    }
}