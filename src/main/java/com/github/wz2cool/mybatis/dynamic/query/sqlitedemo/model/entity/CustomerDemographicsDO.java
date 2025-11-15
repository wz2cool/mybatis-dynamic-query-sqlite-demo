package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity;

import javax.persistence.*;

/**
 * 客户类型表实体类
 */
@Entity
@Table(name = "CustomerDemographics")
public class CustomerDemographicsDO {
    
    @Id
    @Column(name = "CustomerTypeID")
    private String customerTypeId;
    
    @Column(name = "CustomerDesc")
    private String customerDesc;
    
    // Getters and Setters
    public String getCustomerTypeId() {
        return customerTypeId;
    }
    
    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
    
    public String getCustomerDesc() {
        return customerDesc;
    }
    
    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc;
    }
}