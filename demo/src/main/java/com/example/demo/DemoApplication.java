package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@SpringBootApplication
public class DemoApplication  {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null, "Johnny Yes Papa", "johnny", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Johnny Sing", "singer", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Leron Leron", "leron", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Tim Awa", "tim", "1234", new ArrayList<>()));
//
//			userService.addRoleToUser("johnny", "ROLE_USER");
//			userService.addRoleToUser("singer", "ROLE_MANAGER");
//			userService.addRoleToUser("johnny", "ROLE_ADMIN");
//			userService.addRoleToUser("leron", "ROLE_SUPER_ADMIN");
//			userService.addRoleToUser("tim", "ROLE_ADMIN");
//			userService.addRoleToUser("tim", "ROLE_USER");
		};
	}
	
}
