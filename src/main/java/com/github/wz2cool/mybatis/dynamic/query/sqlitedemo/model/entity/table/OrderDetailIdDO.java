package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table;

import java.io.Serializable;

/**
 * OrderDetail表复合主键类
 */
public class OrderDetailIdDO implements Serializable {
    private Integer orderId;
    private Integer productId;
    
    // 必须有无参构造函数
    public OrderDetailIdDO() {}
    
    public OrderDetailIdDO(Integer orderId, Integer productId) {
        this.orderId = orderId;
        this.productId = productId;
    }
    
    // Getters and Setters
    public Integer getOrderId() {
        return orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    
    public Integer getProductId() {
        return productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailIdDO that = (OrderDetailIdDO) o;
        return orderId.equals(that.orderId) && productId.equals(that.productId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(orderId, productId);
    }
}