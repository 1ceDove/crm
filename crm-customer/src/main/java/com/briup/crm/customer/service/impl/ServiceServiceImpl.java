package com.briup.crm.customer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.briup.crm.customer.bean.Service;
import com.briup.crm.customer.mapper.ServiceMapper;
import com.briup.crm.customer.service.ServiceService;

import java.util.List;

/**
* @author 刘斌
* @description 针对表【cst_service】的数据库操作Service实现
* @createDate 2023-06-29 15:04:21
*/
@org.springframework.stereotype.Service
public class ServiceServiceImpl extends ServiceImpl<ServiceMapper, Service>
    implements ServiceService{
    @Override
    public List<Service> getByNameLike(String name) {
        QueryWrapper<Service> wrapper = Wrappers.query();
        wrapper.like("svr_cust_name", name);
        return baseMapper.selectList(wrapper);
    }
}




