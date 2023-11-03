package com.javaproject.springbootproject.controller;

import com.javaproject.springbootproject.exception.ResourceNotFound;
import com.javaproject.springbootproject.model.Addresses;
import com.javaproject.springbootproject.model.User;
import com.javaproject.springbootproject.repository.AddressRepository;
import com.javaproject.springbootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

//    build create user REST API

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

//    build get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        User user = userRepository.findById(id).orElseThrow(()-> new ResourceNotFound("User not exist with id:" + id));

        return ResponseEntity.ok(user);
    }


//    build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable long id,@RequestBody User userDetails){
        User updateUser = userRepository.findById(id).orElseThrow(()-> new ResourceNotFound("User not Exist with id:" + id));

        updateUser.setUserName(userDetails.getUserName());
        updateUser.setUserPassword(userDetails.getUserPassword());
        updateUser.setPhoneNumber(userDetails.getPhoneNumber());
        updateUser.setDateOfRegistration(userDetails.getDateOfRegistration());
        updateUser.setStatus(userDetails.isStatus());
        updateUser.setAddresses(userDetails.getAddresses());
        userRepository.save(updateUser);
        return ResponseEntity.ok(updateUser);
    }

// build delete user REST API

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id){
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFound("User not exist with id:" + id));
        userRepository.delete(user);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
