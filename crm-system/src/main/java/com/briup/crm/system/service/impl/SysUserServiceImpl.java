package com.briup.crm.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.briup.crm.system.bean.SysUser;
import com.briup.crm.system.mapper.SysUserMapper;
import com.briup.crm.system.service.ISysUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liubin
 * @since 2023-06-28
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Override
    public void updateFlag(Long id, int flag){
        baseMapper.updateFlag(id, flag);
    }

    @Override
    public List<SysUser> getByNameLike(String name){
        QueryWrapper<SysUser> wrapper = Wrappers.query();
        wrapper.like("usr_name", name);
        return baseMapper.selectList(wrapper);
    }
}
