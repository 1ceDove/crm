package com.briup.crm.customer.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.briup.crm.common.utils.Result;
import com.briup.crm.customer.bean.Linkman;
import com.briup.crm.customer.service.LinkmanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "联系人管理模块")
@RestController
@RequestMapping("/cst-linkman")
public class LinkmanController {
    @Resource
    private LinkmanService linkmanService;

    @ApiOperation(value = "查找客户")
    @GetMapping("/getById")
    public Result getById(@RequestParam Long id) {
        return Result.success(linkmanService.getById(id));
    }

    @ApiOperation(value = "新增客户")
    @PostMapping("/save")
    public Result save(@RequestBody Linkman linkman) {
        linkmanService.save(linkman);
        return Result.success();
    }

    @ApiOperation(value = "更新客户")
    @PutMapping("/updateById")
    public Result updateById(@RequestBody Linkman linkman) {
        linkmanService.updateById(linkman);
        return Result.success();
    }

    @ApiOperation(value = "删除客户")
    @DeleteMapping("/removeById")
    public Result removeById(@RequestBody Long id) {
        linkmanService.removeById(id);
        return Result.success();
    }

    @ApiOperation("分页查询客户")
    @ApiImplicitParams({@ApiImplicitParam(name = "current", value = "当前页码", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "每页条数", required = true, defaultValue = "10"),
            @ApiImplicitParam(name = "total", value = "总记录数", required = true, defaultValue = "0")})
    @GetMapping("/page")
    public Result page(Long current, long size, long total) {
        return Result.success(linkmanService.page(new Page<>(current, size, total)));
    }

    @ApiOperation("批量删除客户")
    @ApiImplicitParam(name = "ids", value = "ID集合")
    @DeleteMapping("/removeByIds")
    public Result removeByIds(@RequestBody List<Long> ids) {
        linkmanService.removeByIds(ids);
        return Result.success();
    }

    @ApiOperation(value = "模糊查询客户")
    @GetMapping("/getByNameLike")
    public Result getByNameLike(@RequestParam String name){
        return Result.success(linkmanService.getByNameLike(name));
    }
}
