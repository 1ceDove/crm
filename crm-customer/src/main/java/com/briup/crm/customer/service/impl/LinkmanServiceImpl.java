package com.briup.crm.customer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.briup.crm.customer.bean.Linkman;
import com.briup.crm.customer.service.LinkmanService;
import com.briup.crm.customer.mapper.LinkmanMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 刘斌
* @description 针对表【cst_linkman】的数据库操作Service实现
* @createDate 2023-06-29 15:04:21
*/
@Service
public class LinkmanServiceImpl extends ServiceImpl<LinkmanMapper, Linkman>
    implements LinkmanService{

    @Override
    public List<Linkman> getByNameLike(String name) {
        QueryWrapper<Linkman> wrapper = Wrappers.query();
        wrapper.like("lkm_name", name);
        return baseMapper.selectList(wrapper);
    }
}




