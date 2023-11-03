package com.javaproject.springbootproject;

import com.javaproject.springbootproject.model.Addresses;
import com.javaproject.springbootproject.model.User;
import com.javaproject.springbootproject.repository.AddressRepository;
import com.javaproject.springbootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
//		user.setUserName("Rajesh");
//		user.setUserPassword("Aman*1234");
//		user.setPhoneNumber("954971864");
//		user.setDateOfRegistration(new Date());
//		user.setStatus(false);
//		List<Addresses> addresses = new ArrayList<>();
//		Addresses address1 = new Addresses();
//		address1.setFullAddress("gggg");
//		addresses.add(address1);
//		userRepository.save(user);
//

	}
}
