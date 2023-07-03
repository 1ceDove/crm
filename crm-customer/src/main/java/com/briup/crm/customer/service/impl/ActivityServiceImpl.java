package com.briup.crm.customer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.briup.crm.customer.bean.Activity;
import com.briup.crm.customer.service.ActivityService;
import com.briup.crm.customer.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘斌
 * @description 针对表【cst_activity】的数据库操作Service实现
 * @createDate 2023-06-29 15:04:21
 */
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity>
        implements ActivityService {

    @Override
    public List<Activity> getByNameLike(String name) {
        QueryWrapper<Activity> wrapper = Wrappers.query();
        wrapper.like("atv_cust_name", name);
        return baseMapper.selectList(wrapper);
    }
}




