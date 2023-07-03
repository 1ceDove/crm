package com.briup.crm.sale.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.briup.crm.common.utils.Result;
import com.briup.crm.sale.bean.Plan;
import com.briup.crm.sale.service.PlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "客户开发管理模块")
@RestController
@RequestMapping("/sal-plan")
public class PlanController {
    @Resource
    private PlanService planService;

    @ApiOperation(value = "查找客户开发")
    @GetMapping("/getById")
    public Result getById(@RequestParam Long id) {
        return Result.success(planService.getById(id));
    }

    @ApiOperation(value = "新增客户开发")
    @PostMapping("/save")
    public Result save(@RequestBody Plan plan) {
        planService.save(plan);
        return Result.success();
    }

    @ApiOperation(value = "更新客户开发")
    @PutMapping("/updateById")
    public Result updateById(@RequestBody Plan plan) {
        planService.updateById(plan);
        return Result.success();
    }

    @ApiOperation(value = "删除客户开发")
    @DeleteMapping("/removeById")
    public Result removeById(@RequestBody Long id) {
        planService.removeById(id);
        return Result.success();
    }

    @ApiOperation("分页查询客户开发")
    @ApiImplicitParams({@ApiImplicitParam(name = "current", value = "当前页码", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "每页条数", required = true, defaultValue = "10"),
            @ApiImplicitParam(name = "total", value = "总记录数", required = true, defaultValue = "0")})
    @GetMapping("/page")
    public Result page(Long current, long size, long total) {
        return Result.success(planService.page(new Page<>(current, size, total)));
    }

    @ApiOperation("批量删除客户开发")
    @ApiImplicitParam(name = "ids", value = "ID集合")
    @DeleteMapping("/removeByIds")
    public Result removeByIds(@RequestBody List<Long> ids) {
        planService.removeByIds(ids);
        return Result.success();
    }

    @ApiOperation(value = "模糊查询客户开发")
    @GetMapping("/getByManagerNameLike")
    public Result getByNameLike(@RequestParam String name){
        return Result.success(planService.getByNameLike(name));
    }
}
