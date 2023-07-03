package com.briup.crm.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.briup.crm.system.bean.SysRole;
import com.briup.crm.system.mapper.SysRoleMapper;
import com.briup.crm.system.service.ISysRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author liubin
 * @since 2023-06-29
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {
    @Override
    public void updateFlag(Long id, int flag) {
        baseMapper.updateFlag(id, flag);
    }

    @Override
    public List<SysRole> getByNameLike(String name) {
        QueryWrapper<SysRole> wrapper = Wrappers.query();
        wrapper.like("role_name", name);
        return baseMapper.selectList(wrapper);
    }
}
