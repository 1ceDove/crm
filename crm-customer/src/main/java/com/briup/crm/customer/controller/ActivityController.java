package com.briup.crm.customer.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.briup.crm.common.utils.Result;
import com.briup.crm.customer.bean.Activity;
import com.briup.crm.customer.service.ActivityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "交往记录管理模块")
@RestController
@RequestMapping("/cst_activity")
public class ActivityController {
    @Resource
    private ActivityService activityService;

    @ApiOperation(value = "查找记录")
    @GetMapping("/getById")
    public Result getById(@RequestParam Long id) {
        Activity activity = activityService.getById(id);
        return Result.success(activity);
    }

    @ApiOperation(value = "新增记录")
    @PostMapping("/save")
    public Result save(@RequestBody Activity activity) {
        activityService.save(activity);
        return Result.success();
    }

    @ApiOperation(value = "更新记录")
    @PutMapping("/updateById")
    public Result updateById(@RequestBody Activity activity) {
        activityService.updateById(activity);
        return Result.success();
    }

    @ApiOperation(value = "删除记录")
    @DeleteMapping("/removeById")
    public Result removeById(@RequestBody Long id) {
        activityService.removeById(id);
        return Result.success();
    }

    @ApiOperation("分页查询记录")
    @ApiImplicitParams({@ApiImplicitParam(name = "current", value = "当前页码", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "每页条数", required = true, defaultValue = "10"),
            @ApiImplicitParam(name = "total", value = "总记录数", required = true, defaultValue = "0")})
    @GetMapping("/page")
    public Result page(Long current, long size, long total) {
        return Result.success(activityService.page(new Page<>(current, size, total)));
    }

    @ApiOperation("批量删除记录")
    @ApiImplicitParam(name = "ids", value = "ID集合")
    @DeleteMapping("/removeByIds")
    public Result removeByIds(@RequestBody List<Long> ids) {
        activityService.removeByIds(ids);
        return Result.success();
    }

    @ApiOperation(value = "模糊查询记录")
    @GetMapping("/getByNameLike")
    public Result getByNameLike(@RequestParam String name){
        return Result.success(activityService.getByNameLike(name));
    }
}
