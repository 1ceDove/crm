package com.briup.crm.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.briup.crm.system.bean.SysUser;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liubin
 * @since 2023-06-28
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    @Update("update sys_user u set u.usr_flag = #{flag} where u.usr_id = #{id}")
    void updateFlag(Long id, int flag);
}
