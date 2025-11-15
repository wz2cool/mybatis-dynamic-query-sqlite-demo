package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表实体类
 */
@Entity
@Table(name = "Orders")
public class OrderDO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private Integer orderId;
    
    @Column(name = "CustomerID")
    private String customerId;
    
    @Column(name = "EmployeeID")
    private Integer employeeId;
    
    @Column(name = "OrderDate")
    private Date orderDate;
    
    @Column(name = "RequiredDate")
    private Date requiredDate;
    
    @Column(name = "ShippedDate")
    private Date shippedDate;
    
    @Column(name = "ShipVia")
    private Integer shipVia;
    
    @Column(name = "Freight")
    private BigDecimal freight;
    
    @Column(name = "ShipName")
    private String shipName;
    
    @Column(name = "ShipAddress")
    private String shipAddress;
    
    @Column(name = "ShipCity")
    private String shipCity;
    
    @Column(name = "ShipRegion")
    private String shipRegion;
    
    @Column(name = "ShipPostalCode")
    private String shipPostalCode;
    
    @Column(name = "ShipCountry")
    private String shipCountry;
    
    // Getters and Setters
    public Integer getOrderId() {
        return orderId;
    }
    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public Integer getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    
    public Date getOrderDate() {
        return orderDate;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    
    public Date getRequiredDate() {
        return requiredDate;
    }
    
    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }
    
    public Date getShippedDate() {
        return shippedDate;
    }
    
    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }
    
    public Integer getShipVia() {
        return shipVia;
    }
    
    public void setShipVia(Integer shipVia) {
        this.shipVia = shipVia;
    }
    
    public BigDecimal getFreight() {
        return freight;
    }
    
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }
    
    public String getShipName() {
        return shipName;
    }
    
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
    
    public String getShipAddress() {
        return shipAddress;
    }
    
    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }
    
    public String getShipCity() {
        return shipCity;
    }
    
    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }
    
    public String getShipRegion() {
        return shipRegion;
    }
    
    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }
    
    public String getShipPostalCode() {
        return shipPostalCode;
    }
    
    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }
    
    public String getShipCountry() {
        return shipCountry;
    }
    
    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }
}