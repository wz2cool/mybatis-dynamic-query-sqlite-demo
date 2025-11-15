package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table;

import javax.persistence.*;

/**
 * 区域表实体类
 */
@Entity
@Table(name = "Regions")
public class RegionDO {
    
    @Id
    @Column(name = "RegionID")
    private Integer regionId;
    
    @Column(name = "RegionDescription")
    private String regionDescription;
    
    // Getters and Setters
    public Integer getRegionId() {
        return regionId;
    }
    
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
    
    public String getRegionDescription() {
        return regionDescription;
    }
    
    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }
}