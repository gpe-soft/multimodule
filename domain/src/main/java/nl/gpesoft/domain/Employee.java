package nl.gpesoft.domain;

import nl.gpesoft.persistence.base.PersistableEntity;

import java.util.Date;

public class Employee extends PersistableEntity {

    private int employeeNumber;
    private int socialSecurityNumber;
    private String name;
    private Date employedDate;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEmployedDate() {
        return employedDate;
    }

    public void setEmployedDate(Date employedDate) {
        this.employedDate = employedDate;
    }
}