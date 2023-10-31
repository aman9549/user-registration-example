package com.javaproject.springbootproject.controller;

import com.javaproject.springbootproject.model.Addresses;
import com.javaproject.springbootproject.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping
    public List<Addresses> getAllAddress(){
        return addressRepository.findAll();
    }

}
