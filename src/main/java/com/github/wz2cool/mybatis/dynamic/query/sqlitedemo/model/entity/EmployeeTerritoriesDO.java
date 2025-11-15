package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity;

import javax.persistence.*;

/**
 * 员工区域关联表实体类
 */
@Entity
@Table(name = "EmployeeTerritories")
@IdClass(EmployeeTerritoriesIdDO.class)
public class EmployeeTerritoriesDO {
    
    @Id
    @Column(name = "EmployeeID")
    private Integer employeeId;
    
    @Id
    @Column(name = "TerritoryID")
    private String territoryId;
    
    // Getters and Setters
    public Integer getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getTerritoryId() {
        return territoryId;
    }
    
    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }
}