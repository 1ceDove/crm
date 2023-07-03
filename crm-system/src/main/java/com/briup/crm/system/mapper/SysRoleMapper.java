package com.briup.crm.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.briup.crm.system.bean.SysRole;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liubin
 * @since 2023-06-29
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {
    @Update("update sys_role r set r.role_flag = #{flag} where r.role_id = #{id}")
    void updateFlag(Long id, int flag);

}
