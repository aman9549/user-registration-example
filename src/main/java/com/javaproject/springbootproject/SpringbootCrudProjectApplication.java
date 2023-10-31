package com.javaproject.springbootproject;

import com.javaproject.springbootproject.model.Addresses;
import com.javaproject.springbootproject.model.User;
import com.javaproject.springbootproject.repository.AddressRepository;
import com.javaproject.springbootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringbootCrudProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudProjectApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void run(String... args) throws Exception {

//		User user = new User();
//		user.setUserName("Ramesh");
//		user.setUserPassword("Aman*1234");
//		user.setPhoneNumber("954971864");
//		user.setDateOfRegistration(new Date());
//		user.setStatus("Active");
//		userRepository.save(user);
//
//		Addresses addresses = new Addresses();
//		addresses.setFullAddress("Jaipur");
//		addresses.setUser(user);
//		addressRepository.save(addresses);

	}
}
