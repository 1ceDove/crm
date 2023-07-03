package com.briup.crm.auth.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liubin
 * @since 2023-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
@ApiModel(value="SysUser对象", description="")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "usr_id", type = IdType.AUTO)
    private Long usrId;

    @TableField("usr_name")
    private String usrName;

    @TableField("usr_password")
    private String usrPassword;

    @TableField("usr_role_name")
    private String usrRoleName;

    @TableField("usr_flag")
    private Integer usrFlag;

    @TableField("usr_role_id")
    private Long usrRoleId;


}
