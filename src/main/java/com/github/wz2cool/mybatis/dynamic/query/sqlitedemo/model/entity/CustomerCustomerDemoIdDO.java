package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity;

import java.io.Serializable;

/**
 * CustomerCustomerDemo表复合主键类
 */
public class CustomerCustomerDemoIdDO implements Serializable {
    private String customerId;
    private String customerTypeId;
    
    // 必须有无参构造函数
    public CustomerCustomerDemoIdDO() {}
    
    public CustomerCustomerDemoIdDO(String customerId, String customerTypeId) {
        this.customerId = customerId;
        this.customerTypeId = customerTypeId;
    }
    
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCustomerDemoIdDO that = (CustomerCustomerDemoIdDO) o;
        return customerId.equals(that.customerId) && customerTypeId.equals(that.customerTypeId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(customerId, customerTypeId);
    }
}