package com.challengescrd.challenge.user;

import com.challengescrd.challenge.address.Address;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record UserDTO(Long id, String name, String cpf, Date birthdate, String cellphone, Address address) {

}
