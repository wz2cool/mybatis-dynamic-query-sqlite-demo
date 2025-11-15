package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity;

import javax.persistence.*;

/**
 * 区域细分表实体类
 */
@Entity
@Table(name = "Territories")
public class TerritoryDO {
    
    @Id
    @Column(name = "TerritoryID")
    private String territoryId;
    
    @Column(name = "TerritoryDescription")
    private String territoryDescription;
    
    @Column(name = "RegionID")
    private Integer regionId;
    
    // Getters and Setters
    public String getTerritoryId() {
        return territoryId;
    }
    
    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }
    
    public String getTerritoryDescription() {
        return territoryDescription;
    }
    
    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }
    
    public Integer getRegionId() {
        return regionId;
    }
    
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
}