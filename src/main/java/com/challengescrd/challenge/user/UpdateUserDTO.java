package com.challengescrd.challenge.user;

import com.challengescrd.challenge.address.Address;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public class UpdateUserDTO {

    @NotNull
    private Long id;

    private String cellphone;

    private String name;

    private List<Address> addresses;

    public UpdateUserDTO(Long id, String cellphone, String name, List<Address> addresses) {
        this.id = id;
        this.cellphone = cellphone;
        this.name = name;
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
