package com.briup.crm.customer.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName cst_linkman
 */
@TableName(value ="cst_linkman")
@Data
public class Linkman implements Serializable {
    /**
     * 
     */
    @TableId(value = "lkm_id", type = IdType.AUTO)
    private Long lkmId;

    /**
     * 
     */
    @TableField(value = "lkm_cust_id")
    private Long lkmCustId;

    /**
     * 
     */
    @TableField(value = "lkm_name")
    private String lkmName;

    /**
     * 
     */
    @TableField(value = "lkm_sex")
    private String lkmSex;

    /**
     * 
     */
    @TableField(value = "lkm_postion")
    private String lkmPostion;

    /**
     * 
     */
    @TableField(value = "lkm_tel")
    private String lkmTel;

    /**
     * 
     */
    @TableField(value = "lkm_mobile")
    private String lkmMobile;

    /**
     * 
     */
    @TableField(value = "lkm_memo")
    private String lkmMemo;

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
        Linkman other = (Linkman) that;
        return (this.getLkmId() == null ? other.getLkmId() == null : this.getLkmId().equals(other.getLkmId()))
            && (this.getLkmCustId() == null ? other.getLkmCustId() == null : this.getLkmCustId().equals(other.getLkmCustId()))
            && (this.getLkmName() == null ? other.getLkmName() == null : this.getLkmName().equals(other.getLkmName()))
            && (this.getLkmSex() == null ? other.getLkmSex() == null : this.getLkmSex().equals(other.getLkmSex()))
            && (this.getLkmPostion() == null ? other.getLkmPostion() == null : this.getLkmPostion().equals(other.getLkmPostion()))
            && (this.getLkmTel() == null ? other.getLkmTel() == null : this.getLkmTel().equals(other.getLkmTel()))
            && (this.getLkmMobile() == null ? other.getLkmMobile() == null : this.getLkmMobile().equals(other.getLkmMobile()))
            && (this.getLkmMemo() == null ? other.getLkmMemo() == null : this.getLkmMemo().equals(other.getLkmMemo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLkmId() == null) ? 0 : getLkmId().hashCode());
        result = prime * result + ((getLkmCustId() == null) ? 0 : getLkmCustId().hashCode());
        result = prime * result + ((getLkmName() == null) ? 0 : getLkmName().hashCode());
        result = prime * result + ((getLkmSex() == null) ? 0 : getLkmSex().hashCode());
        result = prime * result + ((getLkmPostion() == null) ? 0 : getLkmPostion().hashCode());
        result = prime * result + ((getLkmTel() == null) ? 0 : getLkmTel().hashCode());
        result = prime * result + ((getLkmMobile() == null) ? 0 : getLkmMobile().hashCode());
        result = prime * result + ((getLkmMemo() == null) ? 0 : getLkmMemo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lkmId=").append(lkmId);
        sb.append(", lkmCustId=").append(lkmCustId);
        sb.append(", lkmName=").append(lkmName);
        sb.append(", lkmSex=").append(lkmSex);
        sb.append(", lkmPostion=").append(lkmPostion);
        sb.append(", lkmTel=").append(lkmTel);
        sb.append(", lkmMobile=").append(lkmMobile);
        sb.append(", lkmMemo=").append(lkmMemo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}