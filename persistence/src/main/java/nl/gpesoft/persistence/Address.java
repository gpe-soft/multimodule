package nl.gpesoft.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Address extends AbstractEntity {

    @Column (name="STREET")
    private String street;

    @Column (name="HOUSE_NUMBER")
    private int houseNumber;

    @Column (name="HOUSE_NUMBER_SUFFIX")
    private String houseNumberSuffix;

    @Column (name="POSTAL_CODE")
    private String postalCode;

    @Column (name="CITY")
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    public void setHouseNumberSuffix(String houseNumberSuffix) {
        this.houseNumberSuffix = houseNumberSuffix;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}