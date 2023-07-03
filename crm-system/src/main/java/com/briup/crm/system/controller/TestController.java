package com.briup.crm.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
@Api(tags = "测试模块")
public class TestController {
    @GetMapping("/test")
    @ApiOperation(value = "test方法")
    public String test(){
        return "hello system";
    }
}
