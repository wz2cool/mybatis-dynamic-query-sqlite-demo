package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table;

import javax.persistence.*;

/**
 * 货运公司表实体类
 */
@Entity
@Table(name = "Shippers")
public class ShipperDO {
    
    @Id
    @Column(name = "ShipperID")
    private Integer shipperId;
    
    @Column(name = "CompanyName")
    private String companyName;
    
    @Column(name = "Phone")
    private String phone;
    
    // Getters and Setters
    public Integer getShipperId() {
        return shipperId;
    }
    
    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
}