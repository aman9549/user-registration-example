package com.javaproject.springbootproject.repository;

import com.javaproject.springbootproject.model.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Addresses, Long> {

}
