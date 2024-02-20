package com.challengescrd.challenge.user;

import com.challengescrd.challenge.address.Address;

import java.util.Date;
import java.util.List;

public record UserDTO(Long id, String name, String cpf, Date birthdate, String cellphone, List<Address> addresses) {

}