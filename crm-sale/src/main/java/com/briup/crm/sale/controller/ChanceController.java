package com.briup.crm.sale.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.briup.crm.common.utils.Result;
import com.briup.crm.sale.bean.Chance;
import com.briup.crm.sale.service.ChanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "商机管理模块")
@RestController
@RequestMapping("sal-chance")
public class ChanceController {
    @Resource
    private ChanceService chanceService;

    @ApiOperation(value = "查找商机")
    @GetMapping("/getById")
    public Result getById(@RequestParam Long id) {
        return Result.success(chanceService.getById(id));
    }

    @ApiOperation(value = "新增商机")
    @PostMapping("/save")
    public Result save(@RequestBody Chance chance) {
        chanceService.save(chance);
        return Result.success();
    }

    @ApiOperation(value = "更新商机")
    @PutMapping("/updateById")
    public Result updateById(@RequestBody Chance chance) {
        chanceService.updateById(chance);
        return Result.success();
    }

    @ApiOperation(value = "删除商机")
    @DeleteMapping("/removeById")
    public Result removeById(@RequestBody Long id) {
        chanceService.removeById(id);
        return Result.success();
    }

    @ApiOperation("分页查询商机")
    @ApiImplicitParams({@ApiImplicitParam(name = "current", value = "当前页码", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "size", value = "每页条数", required = true, defaultValue = "10"),
            @ApiImplicitParam(name = "total", value = "总记录数", required = true, defaultValue = "0")})
    @GetMapping("/page")
    public Result page(Long current, long size, long total) {
        return Result.success(chanceService.page(new Page<>(current, size, total)));
    }

    @ApiOperation("批量删除商机")
    @ApiImplicitParam(name = "ids", value = "ID集合")
    @DeleteMapping("/removeByIds")
    public Result removeByIds(@RequestBody List<Long> ids) {
        chanceService.removeByIds(ids);
        return Result.success();
    }

    @ApiOperation(value = "模糊查询商机")
    @GetMapping("/getByNameLike")
    public Result getByNameLike(@RequestParam String name){
        return Result.success(chanceService.getByNameLike(name));
    }
}
