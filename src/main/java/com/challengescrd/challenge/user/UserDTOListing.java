package com.challengescrd.challenge.user;

import com.challengescrd.challenge.address.Address;

import java.util.Date;

public record UserDTOListing(Long id, String name, String cellphone, Address address, String cpf, Date birthdate) {
}
