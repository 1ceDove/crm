package com.briup.crm.customer.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.briup.crm.common.utils.Result;
import com.briup.crm.customer.bean.Service;
import com.briup.crm.customer.service.ServiceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "服务管理模块")
@RestController
@RequestMapping("cst-service")
public class ServiceController {
    @Resource
    private ServiceService serviceService;

    @ApiOperation(value = "查找服务")
    @GetMapping("/getById")
    public Result getById(@RequestParam Long id) {
        return Result.success(serviceService.getById(id));
    }

    @ApiOperation(value = "新增服务")
    @PostMapping("/save")
    public Result save(@RequestBody Service service) {
        serviceService.save(service);
        return Result.success();
    }

    @ApiOperation(value = "更新服务")
    @PutMapping("/updateById")
    public Result updateById(@RequestBody Service service) {
        serviceService.updateById(service);
        return Result.success();
    }

    @ApiOperation(value = "删除服务")
    @DeleteMapping("/removeById")
    public Result removeById(@RequestBody Long id) {
        serviceService.removeById(id);
        return Result.success();
    }

    @ApiOperation("分页查询服务")
    @ApiImplicitParams({@ApiImplicitParam(name = "current", value = "当前页码", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "每页条数", required = true, defaultValue = "10"),
            @ApiImplicitParam(name = "total", value = "总记录数", required = true, defaultValue = "0")})
    @GetMapping("/page")
    public Result page(Long current, long size, long total) {
        return Result.success(serviceService.page(new Page<>(current, size, total)));
    }

    @ApiOperation("批量删除服务")
    @ApiImplicitParam(name = "ids", value = "ID集合")
    @DeleteMapping("/removeByIds")
    public Result removeByIds(@RequestBody List<Long> ids) {
        serviceService.removeByIds(ids);
        return Result.success();
    }

    @ApiOperation(value = "模糊查询服务")
    @GetMapping("/getByNameLike")
    public Result getByNameLike(@RequestParam String name){
        return Result.success(serviceService.getByNameLike(name));
    }
}
