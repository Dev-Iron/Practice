package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {
    @Column(length = 10)
    private String city;
    @Column(length = 20)
    private String street;

    @Column(length = 5)
    private String zipcode;

    private String fullAddress(){
        return getCity() + " " + getStreet() + " " + getZipcode();
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getStreet() {
        return street;
    }

    private void setCity(String city) {
        this.city = city;
    }

    private void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity()) && Objects.equals(getZipcode(), address.getZipcode()) && Objects.equals(getStreet(), address.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getZipcode(), getStreet());
    }
}
