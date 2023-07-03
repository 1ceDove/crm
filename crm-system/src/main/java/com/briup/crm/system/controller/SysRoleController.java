package com.briup.crm.system.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.briup.crm.common.utils.Result;
import com.briup.crm.system.bean.SysRole;
import com.briup.crm.system.service.ISysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liubin
 * @since 2023-06-29
 */
@Api(tags = "角色管理模块")
@RestController
@RequestMapping("/sys-role")
public class SysRoleController {
    @Resource
    private ISysRoleService roleService;

    @ApiOperation(value = "查找角色")
    @GetMapping("/getById")
//    @ApiImplicitParam(name = "id", value = "user_id", required = true)
    public Result getById(@RequestParam Long id) {
        SysRole role = roleService.getById(id);
        return Result.success(role);
    }

    @ApiOperation(value = "新增角色")
    @PostMapping("/save")
    public Result save(@RequestBody SysRole role) {
        roleService.save(role);
        return Result.success();
    }

    @ApiOperation(value = "更新角色")
    @PutMapping("/updateById")
    public Result updateById(@RequestBody SysRole role) {
        roleService.updateById(role);
        return Result.success();
    }

    @ApiOperation(value = "删除角色")
    @DeleteMapping("/removeById")
    public Result removeById(@RequestBody Long id) {
        roleService.removeById(id);
        return Result.success();
    }

    @ApiOperation("分页查询角色")
    @ApiImplicitParams({@ApiImplicitParam(name = "current", value = "当前页码", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "每页条数", required = true, defaultValue = "10"),
            @ApiImplicitParam(name = "total", value = "总记录数", required = true, defaultValue = "0")})
    @GetMapping("/page")
    public Result page(Long current, long size, long total) {
        return Result.success(roleService.page(new Page<>(current, size, total)));
    }

    @ApiOperation("批量删除角色")
    @ApiImplicitParam(name = "ids", value = "ID集合")
    @DeleteMapping("/removeByIds")
    public Result removeByIds(@RequestBody List<Long> ids) {
        roleService.removeByIds(ids);
        return Result.success();
    }

    @ApiOperation(value = "注销或恢复角色", notes = "0:注销 1:正常")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "ID", required = true),
            @ApiImplicitParam(name = "flag", value = "状态", required = true) })
    @PutMapping("/updateFlag")
    public Result updateFlag(Long id, int flag) {
        roleService.updateFlag(id, flag);
        return Result.success();
    }

    @ApiOperation(value = "模糊查询角色")
    @GetMapping("/getByNameLike")
    public Result getByNameLike(@RequestParam String name){
        return Result.success(roleService.getByNameLike(name));
    }
}
