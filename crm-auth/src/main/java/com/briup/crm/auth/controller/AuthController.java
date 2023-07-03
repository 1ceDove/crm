package com.briup.crm.auth.controller;

import com.briup.crm.auth.bean.SysUser;
import com.briup.crm.auth.remote.UserRemote;
import com.briup.crm.common.exception.ServiceException;
import com.briup.crm.common.utils.JwtTokenUtils;
import com.briup.crm.common.utils.Result;
import com.briup.crm.common.utils.ResultCode;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "登录认证模块")
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Resource
    private JwtTokenUtils jwtTokenUtils;
    @Resource
    private UserRemote userRemote;
    @Resource
    private Gson gson;

    @PostMapping("/login")
    public Result login(long id, @RequestBody String password) {
        SysUser user = gson.fromJson(userRemote.getById(id).getData() + "", SysUser.class);
        if (password.equals(user.getUsrPassword())){
            return Result.success(
                    jwtTokenUtils.generateTokenAndRefreshToken(user.getUsrId() + "", user.getUsrName()));
        }
        throw new ServiceException(ResultCode.USER_LOGIN_ERROR);
    }
}
