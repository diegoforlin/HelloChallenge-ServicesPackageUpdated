package com.challengescrd.challenge.controller;
import com.challengescrd.challenge.address.Address;
import com.challengescrd.challenge.entities.User;
import com.challengescrd.challenge.entities.UserRepository;
import com.challengescrd.challenge.service.UserService;
import com.challengescrd.challenge.user.UserDTO;
import com.challengescrd.challenge.user.UserDTOListing;
import com.challengescrd.challenge.user.updateUserDTO;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @Operation(summary = "Cadastro de usuário")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    @Operation(summary = "Ficha de usuários")
    public List<User> getAllUsers() {
        return userService.fetchAllUsers();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Encontre usuário por ID")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.fetchProductById(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/{userId}")
    @Operation(summary = "Atualização de usuário")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminação de usuário por ID")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User Deleted Successfully by ID " + id;
    }
}