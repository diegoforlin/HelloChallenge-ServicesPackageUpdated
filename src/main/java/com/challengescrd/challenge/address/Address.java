package com.challengescrd.challenge.address;

import com.challengescrd.challenge.entities.User;
import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address addresses() {
        return addresses();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void updateAddresses(Address newAddresses) {
        if (newAddresses.getStreet() != null) {
            this.street = newAddresses.getStreet();
        }
        if (newAddresses.getNumber() != null) {
            this.number = newAddresses.getNumber();
        }
        if (newAddresses.getNeighborhood() != null) {
            this.neighborhood = newAddresses.getNeighborhood();
        }
        if (newAddresses.getCity() != null) {
            this.city = newAddresses.getCity();
        }
        if (newAddresses.getState() != null) {
            this.state = newAddresses.getState();
        }
    }
}