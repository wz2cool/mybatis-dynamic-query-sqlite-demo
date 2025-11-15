package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table;

import javax.persistence.*;

/**
 * 分类表实体类
 */
@Entity
@Table(name = "Categories")
public class CategoryDO {
    
    @Id
    @Column(name = "CategoryID")
    private Integer categoryId;
    
    @Column(name = "CategoryName")
    private String categoryName;
    
    @Column(name = "Description")
    private String description;
    
    @Column(name = "Picture")
    private byte[] picture;
    
    // Getters and Setters
    public Integer getCategoryId() {
        return categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public byte[] getPicture() {
        return picture;
    }
    
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}