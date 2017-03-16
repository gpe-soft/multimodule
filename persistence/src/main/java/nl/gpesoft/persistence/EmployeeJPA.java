package nl.gpesoft.persistence;

import nl.gpesoft.persistence.base.PersistableEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EmployeeJPA extends PersistableEntity {

    @Column (name="EMPLOYEE_NUMBER", nullable = false, unique = true)
    private int employeeNumber;

    @Column (name="SOCIAL_SECURITY_NUMBER")
    private int socialSecurityNumber;

    @Column (name="NAME")
    private String name;

    @Column (name="EMPLOYED_DATE")
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