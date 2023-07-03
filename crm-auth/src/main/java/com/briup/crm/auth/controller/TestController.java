package com.briup.crm.auth.controller;

import com.briup.crm.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Api(tags = "测试模块")
public class TestController {
    @GetMapping("/test")
    @ApiOperation(value = "test方法")
    public Result test() {
        return Result.success("hello auth");
    }
}
