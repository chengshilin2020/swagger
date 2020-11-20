package com.example.swagger2.controller;

import com.example.swagger2.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author csl
 */
@RestController
@ApiModel(value = "HelloController2222", description = "HelloController11111")
public class HelloController {

    
    @Value("${server.port}")
    private int serverPort;


    @PostMapping("hello")
    @ApiOperation(value = "hello1111", notes = "hello方法")
    public String hello(User user) {
        return user.getName();
    }

    @GetMapping("")
    @ApiOperation(value = "hello222", notes = "hello1111方法")
    public void hello1() {
        System.out.println(serverPort);
    }
}
