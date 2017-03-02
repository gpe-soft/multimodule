package nl.gpesoft.persistence;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee extends AbstractEntity {

    @Column (nullable = false, unique = true)
    private int employeeNumber;

    @Column
    private int socialSecurityNumber;

    @Column
    private String name;

    @Column
    private Date employedDate;

    private Address address;

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