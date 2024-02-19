package com.challengescrd.challenge.user;

import com.challengescrd.challenge.address.Address;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

public record updateUserDTO(@NotNull Long id, String cellphone, String name, List<Address> address) {


    public Date birthdate() {
        return null;
    }

    public String cpf() {
        return null;
    }
}
