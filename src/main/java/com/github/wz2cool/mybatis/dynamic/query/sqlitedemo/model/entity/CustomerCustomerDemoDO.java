package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity;

import javax.persistence.*;

/**
 * 客户客户类型关联表实体类
 */
@Entity
@Table(name = "CustomerCustomerDemo")
@IdClass(CustomerCustomerDemoIdDO.class)
public class CustomerCustomerDemoDO {
    
    @Id
    @Column(name = "CustomerID")
    private String customerId;
    
    @Id
    @Column(name = "CustomerTypeID")
    private String customerTypeId;
    
    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getCustomerTypeId() {
        return customerTypeId;
    }
    
    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
}