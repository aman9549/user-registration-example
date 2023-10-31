package com.javaproject.springbootproject.repository;

import com.javaproject.springbootproject.model.Addresses;
import com.javaproject.springbootproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}


