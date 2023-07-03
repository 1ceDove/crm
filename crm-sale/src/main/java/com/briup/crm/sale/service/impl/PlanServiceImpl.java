package com.briup.crm.sale.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.briup.crm.sale.bean.Plan;
import com.briup.crm.sale.mapper.PlanMapper;
import com.briup.crm.sale.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 刘斌
* @description 针对表【sal_plan】的数据库操作Service实现
* @createDate 2023-06-29 15:34:09
*/
@Service
public class PlanServiceImpl extends ServiceImpl<PlanMapper, Plan>
    implements PlanService{

    @Override
    public List<Plan> getByNameLike(String name) {
        QueryWrapper<Plan> wrapper = Wrappers.query();
        wrapper.like("pla_todo", name);
        return baseMapper.selectList(wrapper);
    }
}




