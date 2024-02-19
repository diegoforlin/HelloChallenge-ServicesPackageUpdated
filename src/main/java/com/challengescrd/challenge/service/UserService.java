package com.challengescrd.challenge.service;

import com.challengescrd.challenge.entities.User;
import com.challengescrd.challenge.entities.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<User> saveUser(User user) {
        User newUser = userRepository.save(user);
        return ResponseEntity.ok(newUser);
    }

    public List<User> fetchAllUsers() {
        return userRepository.findAll();
    }

    public User fetchProductById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
    }

    public ResponseEntity<String> deleteUser(Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("User Deleted Successfully");
    }

    public ResponseEntity<User> updateUser(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
        existingUser.setName(updatedUser.getName());
        existingUser.setCellphone(updatedUser.getCellphone());
        existingUser.setAddress(updatedUser.getAddress());
        User savedEntity = userRepository.save(existingUser);
        return ResponseEntity.ok(savedEntity);
    }
}
