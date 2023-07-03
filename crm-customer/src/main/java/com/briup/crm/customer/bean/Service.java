package com.briup.crm.customer.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName cst_service
 */
@TableName(value ="cst_service")
@Data
public class Service implements Serializable {
    /**
     * 
     */
    @TableId(value = "svr_id", type = IdType.AUTO)
    private Long svrId;

    /**
     * 
     */
    @TableField(value = "svr_type")
    private String svrType;

    /**
     * 
     */
    @TableField(value = "svr_title")
    private String svrTitle;

    /**
     * 
     */
    @TableField(value = "svr_cust_name")
    private String svrCustName;

    /**
     * 
     */
    @TableField(value = "svr_status")
    private String svrStatus;

    /**
     * 
     */
    @TableField(value = "svr_request")
    private String svrRequest;

    /**
     * 
     */
    @TableField(value = "svr_dispose")
    private String svrDispose;

    /**
     * 
     */
    @TableField(value = "svr_handle")
    private String svrHandle;

    /**
     * 
     */
    @TableField(value = "svr_result")
    private String svrResult;

    /**
     * 
     */
    @TableField(value = "svr_satisfy")
    private String svrSatisfy;

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
        Service other = (Service) that;
        return (this.getSvrId() == null ? other.getSvrId() == null : this.getSvrId().equals(other.getSvrId()))
            && (this.getSvrType() == null ? other.getSvrType() == null : this.getSvrType().equals(other.getSvrType()))
            && (this.getSvrTitle() == null ? other.getSvrTitle() == null : this.getSvrTitle().equals(other.getSvrTitle()))
            && (this.getSvrCustName() == null ? other.getSvrCustName() == null : this.getSvrCustName().equals(other.getSvrCustName()))
            && (this.getSvrStatus() == null ? other.getSvrStatus() == null : this.getSvrStatus().equals(other.getSvrStatus()))
            && (this.getSvrRequest() == null ? other.getSvrRequest() == null : this.getSvrRequest().equals(other.getSvrRequest()))
            && (this.getSvrDispose() == null ? other.getSvrDispose() == null : this.getSvrDispose().equals(other.getSvrDispose()))
            && (this.getSvrHandle() == null ? other.getSvrHandle() == null : this.getSvrHandle().equals(other.getSvrHandle()))
            && (this.getSvrResult() == null ? other.getSvrResult() == null : this.getSvrResult().equals(other.getSvrResult()))
            && (this.getSvrSatisfy() == null ? other.getSvrSatisfy() == null : this.getSvrSatisfy().equals(other.getSvrSatisfy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrId() == null) ? 0 : getSvrId().hashCode());
        result = prime * result + ((getSvrType() == null) ? 0 : getSvrType().hashCode());
        result = prime * result + ((getSvrTitle() == null) ? 0 : getSvrTitle().hashCode());
        result = prime * result + ((getSvrCustName() == null) ? 0 : getSvrCustName().hashCode());
        result = prime * result + ((getSvrStatus() == null) ? 0 : getSvrStatus().hashCode());
        result = prime * result + ((getSvrRequest() == null) ? 0 : getSvrRequest().hashCode());
        result = prime * result + ((getSvrDispose() == null) ? 0 : getSvrDispose().hashCode());
        result = prime * result + ((getSvrHandle() == null) ? 0 : getSvrHandle().hashCode());
        result = prime * result + ((getSvrResult() == null) ? 0 : getSvrResult().hashCode());
        result = prime * result + ((getSvrSatisfy() == null) ? 0 : getSvrSatisfy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrId=").append(svrId);
        sb.append(", svrType=").append(svrType);
        sb.append(", svrTitle=").append(svrTitle);
        sb.append(", svrCustName=").append(svrCustName);
        sb.append(", svrStatus=").append(svrStatus);
        sb.append(", svrRequest=").append(svrRequest);
        sb.append(", svrDispose=").append(svrDispose);
        sb.append(", svrHandle=").append(svrHandle);
        sb.append(", svrResult=").append(svrResult);
        sb.append(", svrSatisfy=").append(svrSatisfy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}