package com.briup.crm.customer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.briup.crm.customer.bean.Customer;
import com.briup.crm.customer.service.CustomerService;
import com.briup.crm.customer.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘斌
 * @description 针对表【cst_customer】的数据库操作Service实现
 * @createDate 2023-06-29 15:04:21
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
        implements CustomerService {

    @Override
    public List<Customer> getByNameLike(String name) {
        QueryWrapper<Customer> wrapper = Wrappers.query();
        wrapper.like("cust_name", name);
        return baseMapper.selectList(wrapper);
    }
}




