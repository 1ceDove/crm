package com.briup.crm.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.briup.crm.system.bean.SysUser;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liubin
 * @since 2023-06-28
 */
public interface ISysUserService extends IService<SysUser> {
    void updateFlag(Long id, int flag);

    List<SysUser> getByNameLike(String name);
}
