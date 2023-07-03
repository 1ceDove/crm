package com.briup.crm.sale.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.briup.crm.sale.bean.Chance;
import com.briup.crm.sale.mapper.ChanceMapper;
import com.briup.crm.sale.service.ChanceService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 刘斌
* @description 针对表【sal_chance】的数据库操作Service实现
* @createDate 2023-06-29 15:34:08
*/
@Service
public class ChanceServiceImpl extends ServiceImpl<ChanceMapper, Chance>
    implements ChanceService{

    @Override
    public List<Chance> getByNameLike(String name) {
        QueryWrapper<Chance> wrapper = Wrappers.query();
        wrapper.like("chc_cust_name", name);
        return baseMapper.selectList(wrapper);
    }
}




