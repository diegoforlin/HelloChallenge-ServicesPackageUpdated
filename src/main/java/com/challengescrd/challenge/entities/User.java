package com.challengescrd.challenge.entities;

import com.challengescrd.challenge.address.Address;
import com.challengescrd.challenge.user.UserDTO;
import io.swagger.annotations.Api;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_user")
@Api
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private Date birthdate;
    private String cellphone;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    private List<Address> addresses;

    public User() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public User(Long id, String name, String cpf, Date birthdate, String cellphone, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.birthdate = birthdate;
        this.cellphone = cellphone;
        this.addresses = addresses;
    }
    public void update(User updatedUser) {
        this.name = updatedUser.getName();
        this.cpf = updatedUser.getCpf();
        this.birthdate = updatedUser.getBirthdate();
        this.cellphone = updatedUser.getCellphone();
        this.addresses = updatedUser.getAddresses();
    }
}