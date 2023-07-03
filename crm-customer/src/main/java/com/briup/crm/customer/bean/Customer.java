package com.briup.crm.customer.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName cst_customer
 */
@TableName(value ="cst_customer")
@Data
public class Customer implements Serializable {
    /**
     * 
     */
    @TableId(value = "cust_id", type = IdType.AUTO)
    private Long custId;

    /**
     * 
     */
    @TableField(value = "cust_name")
    private String custName;

    /**
     * 
     */
    @TableField(value = "cust_region")
    private String custRegion;

    /**
     * 
     */
    @TableField(value = "cust_manager_id")
    private Long custManagerId;

    /**
     * 
     */
    @TableField(value = "cust_manager_name")
    private String custManagerName;

    /**
     * 
     */
    @TableField(value = "cust_level_label")
    private String custLevelLabel;

    /**
     * 
     */
    @TableField(value = "cust_satisfy")
    private Integer custSatisfy;

    /**
     * 
     */
    @TableField(value = "cust_credit")
    private Integer custCredit;

    /**
     * 
     */
    @TableField(value = "cust_addr")
    private String custAddr;

    /**
     * 
     */
    @TableField(value = "cust_zip")
    private String custZip;

    /**
     * 
     */
    @TableField(value = "cust_tel")
    private String custTel;

    /**
     * 
     */
    @TableField(value = "cust_fax")
    private String custFax;

    /**
     * 
     */
    @TableField(value = "cust_website")
    private String custWebsite;

    /**
     * 
     */
    @TableField(value = "cust_licence_no")
    private String custLicenceNo;

    /**
     * 
     */
    @TableField(value = "cust_chieftain")
    private String custChieftain;

    /**
     * 
     */
    @TableField(value = "cust_bankroll")
    private Double custBankroll;

    /**
     * 
     */
    @TableField(value = "cust_turnover")
    private Double custTurnover;

    /**
     * 
     */
    @TableField(value = "cust_bank")
    private String custBank;

    /**
     * 
     */
    @TableField(value = "cust_bank_account")
    private String custBankAccount;

    /**
     * 
     */
    @TableField(value = "cust_local_tax_no")
    private String custLocalTaxNo;

    /**
     * 
     */
    @TableField(value = "cust_national_tax_no")
    private String custNationalTaxNo;

    /**
     * 
     */
    @TableField(value = "cust_status")
    private String custStatus;

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
        Customer other = (Customer) that;
        return (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustRegion() == null ? other.getCustRegion() == null : this.getCustRegion().equals(other.getCustRegion()))
            && (this.getCustManagerId() == null ? other.getCustManagerId() == null : this.getCustManagerId().equals(other.getCustManagerId()))
            && (this.getCustManagerName() == null ? other.getCustManagerName() == null : this.getCustManagerName().equals(other.getCustManagerName()))
            && (this.getCustLevelLabel() == null ? other.getCustLevelLabel() == null : this.getCustLevelLabel().equals(other.getCustLevelLabel()))
            && (this.getCustSatisfy() == null ? other.getCustSatisfy() == null : this.getCustSatisfy().equals(other.getCustSatisfy()))
            && (this.getCustCredit() == null ? other.getCustCredit() == null : this.getCustCredit().equals(other.getCustCredit()))
            && (this.getCustAddr() == null ? other.getCustAddr() == null : this.getCustAddr().equals(other.getCustAddr()))
            && (this.getCustZip() == null ? other.getCustZip() == null : this.getCustZip().equals(other.getCustZip()))
            && (this.getCustTel() == null ? other.getCustTel() == null : this.getCustTel().equals(other.getCustTel()))
            && (this.getCustFax() == null ? other.getCustFax() == null : this.getCustFax().equals(other.getCustFax()))
            && (this.getCustWebsite() == null ? other.getCustWebsite() == null : this.getCustWebsite().equals(other.getCustWebsite()))
            && (this.getCustLicenceNo() == null ? other.getCustLicenceNo() == null : this.getCustLicenceNo().equals(other.getCustLicenceNo()))
            && (this.getCustChieftain() == null ? other.getCustChieftain() == null : this.getCustChieftain().equals(other.getCustChieftain()))
            && (this.getCustBankroll() == null ? other.getCustBankroll() == null : this.getCustBankroll().equals(other.getCustBankroll()))
            && (this.getCustTurnover() == null ? other.getCustTurnover() == null : this.getCustTurnover().equals(other.getCustTurnover()))
            && (this.getCustBank() == null ? other.getCustBank() == null : this.getCustBank().equals(other.getCustBank()))
            && (this.getCustBankAccount() == null ? other.getCustBankAccount() == null : this.getCustBankAccount().equals(other.getCustBankAccount()))
            && (this.getCustLocalTaxNo() == null ? other.getCustLocalTaxNo() == null : this.getCustLocalTaxNo().equals(other.getCustLocalTaxNo()))
            && (this.getCustNationalTaxNo() == null ? other.getCustNationalTaxNo() == null : this.getCustNationalTaxNo().equals(other.getCustNationalTaxNo()))
            && (this.getCustStatus() == null ? other.getCustStatus() == null : this.getCustStatus().equals(other.getCustStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustRegion() == null) ? 0 : getCustRegion().hashCode());
        result = prime * result + ((getCustManagerId() == null) ? 0 : getCustManagerId().hashCode());
        result = prime * result + ((getCustManagerName() == null) ? 0 : getCustManagerName().hashCode());
        result = prime * result + ((getCustLevelLabel() == null) ? 0 : getCustLevelLabel().hashCode());
        result = prime * result + ((getCustSatisfy() == null) ? 0 : getCustSatisfy().hashCode());
        result = prime * result + ((getCustCredit() == null) ? 0 : getCustCredit().hashCode());
        result = prime * result + ((getCustAddr() == null) ? 0 : getCustAddr().hashCode());
        result = prime * result + ((getCustZip() == null) ? 0 : getCustZip().hashCode());
        result = prime * result + ((getCustTel() == null) ? 0 : getCustTel().hashCode());
        result = prime * result + ((getCustFax() == null) ? 0 : getCustFax().hashCode());
        result = prime * result + ((getCustWebsite() == null) ? 0 : getCustWebsite().hashCode());
        result = prime * result + ((getCustLicenceNo() == null) ? 0 : getCustLicenceNo().hashCode());
        result = prime * result + ((getCustChieftain() == null) ? 0 : getCustChieftain().hashCode());
        result = prime * result + ((getCustBankroll() == null) ? 0 : getCustBankroll().hashCode());
        result = prime * result + ((getCustTurnover() == null) ? 0 : getCustTurnover().hashCode());
        result = prime * result + ((getCustBank() == null) ? 0 : getCustBank().hashCode());
        result = prime * result + ((getCustBankAccount() == null) ? 0 : getCustBankAccount().hashCode());
        result = prime * result + ((getCustLocalTaxNo() == null) ? 0 : getCustLocalTaxNo().hashCode());
        result = prime * result + ((getCustNationalTaxNo() == null) ? 0 : getCustNationalTaxNo().hashCode());
        result = prime * result + ((getCustStatus() == null) ? 0 : getCustStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custRegion=").append(custRegion);
        sb.append(", custManagerId=").append(custManagerId);
        sb.append(", custManagerName=").append(custManagerName);
        sb.append(", custLevelLabel=").append(custLevelLabel);
        sb.append(", custSatisfy=").append(custSatisfy);
        sb.append(", custCredit=").append(custCredit);
        sb.append(", custAddr=").append(custAddr);
        sb.append(", custZip=").append(custZip);
        sb.append(", custTel=").append(custTel);
        sb.append(", custFax=").append(custFax);
        sb.append(", custWebsite=").append(custWebsite);
        sb.append(", custLicenceNo=").append(custLicenceNo);
        sb.append(", custChieftain=").append(custChieftain);
        sb.append(", custBankroll=").append(custBankroll);
        sb.append(", custTurnover=").append(custTurnover);
        sb.append(", custBank=").append(custBank);
        sb.append(", custBankAccount=").append(custBankAccount);
        sb.append(", custLocalTaxNo=").append(custLocalTaxNo);
        sb.append(", custNationalTaxNo=").append(custNationalTaxNo);
        sb.append(", custStatus=").append(custStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}