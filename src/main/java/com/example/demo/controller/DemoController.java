package com.example.demo.controller;

import com.example.demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试接口",tags = "用户接口")
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "查询用户",notes = "查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName",value = "用户名",required = true,dataType = "String",paramType = "path")
    })
    @GetMapping("demo/{userName}")
    public String demo(@PathVariable  String userName){
        logger.info("测试一下");
        return "OK";
    }

    @ApiOperation(value = "添加用户")
    @ApiImplicitParam(name="userName",value = "用户名")
    @PostMapping("insertUser")
    public String addUser(User user){
        return "OK";
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }
}
