package com.briup.crm.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.briup.crm.system.bean.SysRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liubin
 * @since 2023-06-29
 */
public interface ISysRoleService extends IService<SysRole> {
    void updateFlag(Long id, int flag);

    List<SysRole> getByNameLike(String name);
}
