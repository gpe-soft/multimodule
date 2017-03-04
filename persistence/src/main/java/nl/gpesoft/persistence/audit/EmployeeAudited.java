package nl.gpesoft.persistence.audit;

import nl.gpesoft.persistence.AddressJPA;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EmployeeAudited extends AuditableEntity {

    @Column (name="EMPLOYEE_NUMBER", nullable = false, unique = true)
    private int employeeNumber;

    @Column (name="SOCIAL_SECURITY_NUMBER")
    private int socialSecurityNumber;

    @Column (name="NAME")
    private String name;

    @Column (name="EMPLOYED_DATE")
    private Date employedDate;

    @OneToOne (optional = false, orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name="ADDRESS_ID")
    private AddressJPA addressJPA;

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

    public AddressJPA getAddressJPA() {
        return addressJPA;
    }

    public void setAddressJPA(AddressJPA addressJPA) {
        this.addressJPA = addressJPA;
    }
}