package com.github.wz2cool.mybatis.dynamic.query.sqlitedemo.model.entity.table;

import javax.persistence.*;
import java.util.Date;

/**
 * 员工表实体类
 */
@Entity
@Table(name = "Employees")
public class EmployeeDO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
    private Integer employeeId;
    
    @Column(name = "LastName")
    private String lastName;
    
    @Column(name = "FirstName")
    private String firstName;
    
    @Column(name = "Title")
    private String title;
    
    @Column(name = "TitleOfCourtesy")
    private String titleOfCourtesy;
    
    @Column(name = "BirthDate")
    private Date birthDate;
    
    @Column(name = "HireDate")
    private Date hireDate;
    
    @Column(name = "Address")
    private String address;
    
    @Column(name = "City")
    private String city;
    
    @Column(name = "Region")
    private String region;
    
    @Column(name = "PostalCode")
    private String postalCode;
    
    @Column(name = "Country")
    private String country;
    
    @Column(name = "HomePhone")
    private String homePhone;
    
    @Column(name = "Extension")
    private String extension;
    
    @Column(name = "Photo")
    private byte[] photo;
    
    @Column(name = "Notes")
    private String notes;
    
    @Column(name = "ReportsTo")
    private Integer reportsTo;
    
    @Column(name = "PhotoPath")
    private String photoPath;
    
    // Getters and Setters
    public Integer getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }
    
    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public Date getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getPostalCode() {
        return postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getHomePhone() {
        return homePhone;
    }
    
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    
    public String getExtension() {
        return extension;
    }
    
    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    public byte[] getPhoto() {
        return photo;
    }
    
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public Integer getReportsTo() {
        return reportsTo;
    }
    
    public void setReportsTo(Integer reportsTo) {
        this.reportsTo = reportsTo;
    }
    
    public String getPhotoPath() {
        return photoPath;
    }
    
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}