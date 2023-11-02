package com.javaproject.springbootproject.controller;

import com.javaproject.springbootproject.exception.ResourceNotFound;
import com.javaproject.springbootproject.model.Addresses;
import com.javaproject.springbootproject.model.User;
import com.javaproject.springbootproject.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public List<Addresses> getAllAddress(){
        return addressRepository.findAll();
    }

    //    build create user REST API

    @PostMapping
    public Addresses createAddress(@RequestBody Addresses addresses){
        return addressRepository.save(addresses);
    }

    //    build get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Addresses> getAddressById(@PathVariable long id){
        Addresses addresses = addressRepository.findById(id).orElseThrow(()-> new ResourceNotFound("User not exist with id:" + id));

        return ResponseEntity.ok(addresses);}

    //    build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Addresses> updateAddress(@PathVariable long id,@RequestBody Addresses AddressDetails){
        Addresses updateAddress = addressRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Address not Exist with id:" + id));

        updateAddress.setFullAddress(AddressDetails.getFullAddress());
        return ResponseEntity.ok(updateAddress);
    }

    // build delete user REST API

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteAddress(@PathVariable long id) {
        Addresses addresses = addressRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Address not exist with id:" + id));
        addressRepository.delete(addresses);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
