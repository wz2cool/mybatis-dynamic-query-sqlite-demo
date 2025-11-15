package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 订单明细表实体类
 */
@Entity
@Table(name = "Order Details")
@IdClass(OrderDetailIdDO.class)
public class OrderDetailDO {
    
    @Id
    @Column(name = "OrderID")
    private Integer orderId;
    
    @Id
    @Column(name = "ProductID")
    private Integer productId;
    
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    
    @Column(name = "Quantity")
    private Integer quantity;
    
    @Column(name = "Discount")
    private BigDecimal discount;
    
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
    
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public BigDecimal getDiscount() {
        return discount;
    }
    
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}