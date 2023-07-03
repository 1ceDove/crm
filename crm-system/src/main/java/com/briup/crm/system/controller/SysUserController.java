package com.briup.crm.system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.briup.crm.common.utils.Result;
import com.briup.crm.system.bean.SysUser;
import com.briup.crm.system.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liubin
 * @since 2023-06-28
 */
@Api(tags = "用户管理模块")
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Resource
    private ISysUserService userService;

    @ApiOperation(value = "查找用户")
    @GetMapping("/getById")
//    @ApiImplicitParam(name = "id", value = "user_id", required = true)
    public Result getById(@RequestParam Long id) {
        SysUser user = userService.getById(id);
        return Result.success(user);
    }

    @ApiOperation(value = "新增用户")
    @PostMapping("/save")
    public Result save(@RequestBody SysUser user) {
        userService.save(user);
        return Result.success();
    }

    @ApiOperation(value = "更新用户")
    @PutMapping("/updateById")
    public Result updateById(@RequestBody SysUser user) {
        userService.updateById(user);
        return Result.success();
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("/removeById")
    public Result removeById(@RequestBody Long id) {
        userService.removeById(id);
        return Result.success();
    }

    @ApiOperation("分页查询用户")
    @ApiImplicitParams({@ApiImplicitParam(name = "current", value = "当前页码", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "每页条数", required = true, defaultValue = "10"),
            @ApiImplicitParam(name = "total", value = "总记录数", required = true, defaultValue = "0")})
    @GetMapping("/page")
    public Result page(Long current, long size, long total) {
        return Result.success(userService.page(new Page<>(current, size, total)));
    }

    @ApiOperation("批量删除用户")
    @ApiImplicitParam(name = "ids", value = "ID集合")
    @DeleteMapping("/removeByIds")
    public Result removeByIds(@RequestBody List<Long> ids) {
        userService.removeByIds(ids);
        return Result.success();
    }

    @ApiOperation(value = "注销或恢复用户", notes = "0:注销 1:正常")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "ID", required = true),
            @ApiImplicitParam(name = "flag", value = "状态", required = true) })
    @PutMapping("/updateFlag")
    public Result updateFlag(Long id, int flag) {
        userService.updateFlag(id, flag);
        return Result.success();
    }

    @ApiOperation(value = "模糊查询用户")
    @GetMapping("/getByNameLike")
    public Result getByNameLike(@RequestParam String name){
        return Result.success(userService.getByNameLike(name));
    }
}
