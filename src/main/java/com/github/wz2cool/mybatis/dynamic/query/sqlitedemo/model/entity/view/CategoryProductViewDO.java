package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.view;

import com.github.wz2cool.dynamic.mybatis.View;

import javax.persistence.Column;
import java.math.BigDecimal;

@View("Categories JOIN Products ON Categories.CategoryID = Products.CategoryID ${ON_CONDITION_EXPRESSION}")
public class CategoryProductViewDO {

    @Column(name = "CategoryName", table = "Categories")
    private String categoryName;

    @Column(name = "ProductID", table = "Products")
    private Integer productId;

    @Column(name = "ProductName", table = "Products")
    private String productName;

    @Column(name = "SupplierID", table = "Products")
    private Integer supplierId;

    @Column(name = "CategoryID", table = "Products")
    private Integer categoryId;

    @Column(name = "QuantityPerUnit", table = "Products")
    private String quantityPerUnit;

    @Column(name = "UnitPrice", table = "Products")
    private BigDecimal unitPrice;

    @Column(name = "UnitsInStock", table = "Products")
    private Integer unitsInStock;

    @Column(name = "UnitsOnOrder", table = "Products")
    private Integer unitsOnOrder;

    @Column(name = "ReorderLevel", table = "Products")
    private Integer reorderLevel;

    @Column(name = "Discontinued", table = "Products")
    private String discontinued;

    // Getters and Setters
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Integer getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Integer unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Integer getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Integer reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public String getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(String discontinued) {
        this.discontinued = discontinued;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
