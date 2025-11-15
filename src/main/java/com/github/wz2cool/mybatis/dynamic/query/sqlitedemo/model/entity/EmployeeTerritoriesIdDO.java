package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity;

import java.io.Serializable;

/**
 * EmployeeTerritories表复合主键类
 */
public class EmployeeTerritoriesIdDO implements Serializable {
    private Integer employeeId;
    private String territoryId;
    
    // 必须有无参构造函数
    public EmployeeTerritoriesIdDO() {}
    
    public EmployeeTerritoriesIdDO(Integer employeeId, String territoryId) {
        this.employeeId = employeeId;
        this.territoryId = territoryId;
    }
    
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTerritoriesIdDO that = (EmployeeTerritoriesIdDO) o;
        return employeeId.equals(that.employeeId) && territoryId.equals(that.territoryId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(employeeId, territoryId);
    }
}