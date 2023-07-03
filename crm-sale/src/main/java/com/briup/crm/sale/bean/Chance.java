package com.briup.crm.sale.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName sal_chance
 */
@TableName(value ="sal_chance")
@Data
public class Chance implements Serializable {
    /**
     * 
     */
    @TableId(value = "chc_id", type = IdType.AUTO)
    private Long chcId;

    /**
     * 
     */
    @TableField(value = "chc_source")
    private String chcSource;

    /**
     * 
     */
    @TableField(value = "chc_cust_name")
    private String chcCustName;

    /**
     * 
     */
    @TableField(value = "chc_title")
    private String chcTitle;

    /**
     * 
     */
    @TableField(value = "chc_rate")
    private Integer chcRate;

    /**
     * 
     */
    @TableField(value = "chc_linkman")
    private String chcLinkman;

    /**
     * 
     */
    @TableField(value = "chc_tel")
    private String chcTel;

    /**
     * 
     */
    @TableField(value = "chc_addr")
    private String chcAddr;

    /**
     * 
     */
    @TableField(value = "chc_desc")
    private String chcDesc;

    /**
     * 
     */
    @TableField(value = "chc_create_by")
    private String chcCreateBy;

    /**
     * 
     */
    @TableField(value = "chc_due_to")
    private String chcDueTo;

    /**
     * 
     */
    @TableField(value = "chc_status")
    private Integer chcStatus;

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
        Chance other = (Chance) that;
        return (this.getChcId() == null ? other.getChcId() == null : this.getChcId().equals(other.getChcId()))
            && (this.getChcSource() == null ? other.getChcSource() == null : this.getChcSource().equals(other.getChcSource()))
            && (this.getChcCustName() == null ? other.getChcCustName() == null : this.getChcCustName().equals(other.getChcCustName()))
            && (this.getChcTitle() == null ? other.getChcTitle() == null : this.getChcTitle().equals(other.getChcTitle()))
            && (this.getChcRate() == null ? other.getChcRate() == null : this.getChcRate().equals(other.getChcRate()))
            && (this.getChcLinkman() == null ? other.getChcLinkman() == null : this.getChcLinkman().equals(other.getChcLinkman()))
            && (this.getChcTel() == null ? other.getChcTel() == null : this.getChcTel().equals(other.getChcTel()))
            && (this.getChcAddr() == null ? other.getChcAddr() == null : this.getChcAddr().equals(other.getChcAddr()))
            && (this.getChcDesc() == null ? other.getChcDesc() == null : this.getChcDesc().equals(other.getChcDesc()))
            && (this.getChcCreateBy() == null ? other.getChcCreateBy() == null : this.getChcCreateBy().equals(other.getChcCreateBy()))
            && (this.getChcDueTo() == null ? other.getChcDueTo() == null : this.getChcDueTo().equals(other.getChcDueTo()))
            && (this.getChcStatus() == null ? other.getChcStatus() == null : this.getChcStatus().equals(other.getChcStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChcId() == null) ? 0 : getChcId().hashCode());
        result = prime * result + ((getChcSource() == null) ? 0 : getChcSource().hashCode());
        result = prime * result + ((getChcCustName() == null) ? 0 : getChcCustName().hashCode());
        result = prime * result + ((getChcTitle() == null) ? 0 : getChcTitle().hashCode());
        result = prime * result + ((getChcRate() == null) ? 0 : getChcRate().hashCode());
        result = prime * result + ((getChcLinkman() == null) ? 0 : getChcLinkman().hashCode());
        result = prime * result + ((getChcTel() == null) ? 0 : getChcTel().hashCode());
        result = prime * result + ((getChcAddr() == null) ? 0 : getChcAddr().hashCode());
        result = prime * result + ((getChcDesc() == null) ? 0 : getChcDesc().hashCode());
        result = prime * result + ((getChcCreateBy() == null) ? 0 : getChcCreateBy().hashCode());
        result = prime * result + ((getChcDueTo() == null) ? 0 : getChcDueTo().hashCode());
        result = prime * result + ((getChcStatus() == null) ? 0 : getChcStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chcId=").append(chcId);
        sb.append(", chcSource=").append(chcSource);
        sb.append(", chcCustName=").append(chcCustName);
        sb.append(", chcTitle=").append(chcTitle);
        sb.append(", chcRate=").append(chcRate);
        sb.append(", chcLinkman=").append(chcLinkman);
        sb.append(", chcTel=").append(chcTel);
        sb.append(", chcAddr=").append(chcAddr);
        sb.append(", chcDesc=").append(chcDesc);
        sb.append(", chcCreateBy=").append(chcCreateBy);
        sb.append(", chcDueTo=").append(chcDueTo);
        sb.append(", chcStatus=").append(chcStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}