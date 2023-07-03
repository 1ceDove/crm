package com.briup.crm.sale.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sal_plan
 */
@TableName(value ="sal_plan")
@Data
public class Plan implements Serializable {
    /**
     * 
     */
    @TableId(value = "pla_id", type = IdType.AUTO)
    private Long plaId;

    /**
     * 
     */
    @TableField(value = "pla_chc_id")
    private Long plaChcId;

    /**
     * 
     */
    @TableField(value = "pla_todo")
    private String plaTodo;

    /**
     * 
     */
    @TableField(value = "pla_result")
    private String plaResult;

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
        Plan other = (Plan) that;
        return (this.getPlaId() == null ? other.getPlaId() == null : this.getPlaId().equals(other.getPlaId()))
            && (this.getPlaChcId() == null ? other.getPlaChcId() == null : this.getPlaChcId().equals(other.getPlaChcId()))
            && (this.getPlaTodo() == null ? other.getPlaTodo() == null : this.getPlaTodo().equals(other.getPlaTodo()))
            && (this.getPlaResult() == null ? other.getPlaResult() == null : this.getPlaResult().equals(other.getPlaResult()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlaId() == null) ? 0 : getPlaId().hashCode());
        result = prime * result + ((getPlaChcId() == null) ? 0 : getPlaChcId().hashCode());
        result = prime * result + ((getPlaTodo() == null) ? 0 : getPlaTodo().hashCode());
        result = prime * result + ((getPlaResult() == null) ? 0 : getPlaResult().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plaId=").append(plaId);
        sb.append(", plaChcId=").append(plaChcId);
        sb.append(", plaTodo=").append(plaTodo);
        sb.append(", plaResult=").append(plaResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}