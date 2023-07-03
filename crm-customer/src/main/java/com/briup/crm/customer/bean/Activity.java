package com.briup.crm.customer.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName cst_activity
 */
@TableName(value ="cst_activity")
@Data
public class Activity implements Serializable {
    /**
     * 
     */
    @TableId(value = "atv_id", type = IdType.AUTO)
    private Long atvId;

    /**
     * 
     */
    @TableField(value = "atv_cust_name")
    private String atvCustName;

    /**
     * 
     */
    @TableField(value = "atv_place")
    private String atvPlace;

    /**
     * 
     */
    @TableField(value = "atv_title")
    private String atvTitle;

    /**
     * 
     */
    @TableField(value = "atv_memo")
    private String atvMemo;

    /**
     * 
     */
    @TableField(value = "atv_cust_id")
    private Long atvCustId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Activity other = (Activity) that;
        return (this.getAtvId() == null ? other.getAtvId() == null : this.getAtvId().equals(other.getAtvId()))
            && (this.getAtvCustName() == null ? other.getAtvCustName() == null : this.getAtvCustName().equals(other.getAtvCustName()))
            && (this.getAtvPlace() == null ? other.getAtvPlace() == null : this.getAtvPlace().equals(other.getAtvPlace()))
            && (this.getAtvTitle() == null ? other.getAtvTitle() == null : this.getAtvTitle().equals(other.getAtvTitle()))
            && (this.getAtvMemo() == null ? other.getAtvMemo() == null : this.getAtvMemo().equals(other.getAtvMemo()))
            && (this.getAtvCustId() == null ? other.getAtvCustId() == null : this.getAtvCustId().equals(other.getAtvCustId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAtvId() == null) ? 0 : getAtvId().hashCode());
        result = prime * result + ((getAtvCustName() == null) ? 0 : getAtvCustName().hashCode());
        result = prime * result + ((getAtvPlace() == null) ? 0 : getAtvPlace().hashCode());
        result = prime * result + ((getAtvTitle() == null) ? 0 : getAtvTitle().hashCode());
        result = prime * result + ((getAtvMemo() == null) ? 0 : getAtvMemo().hashCode());
        result = prime * result + ((getAtvCustId() == null) ? 0 : getAtvCustId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", atvId=").append(atvId);
        sb.append(", atvCustName=").append(atvCustName);
        sb.append(", atvPlace=").append(atvPlace);
        sb.append(", atvTitle=").append(atvTitle);
        sb.append(", atvMemo=").append(atvMemo);
        sb.append(", atvCustId=").append(atvCustId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}