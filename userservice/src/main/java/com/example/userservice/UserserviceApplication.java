package com.example.userservice;

import com.example.userservice.models.Role;
import com.example.userservice.models.User;
import com.example.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
/*
	@Bean
	CommandLineRunner run(UserService userService){
		return args ->{

			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));

			userService.saveUser(new User(null, "Will Smith", "will", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Jim Carry", "jim", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Luigi Pinna", "luigi", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Cinzia Cadeddu", "cinzia", "1234", new ArrayList<>()));

			userService.addRoleToUser("will", "ROLE_ADMIN");
			userService.addRoleToUser("jim", "ROLE_USER");
			userService.addRoleToUser("luigi", "ROLE_ADMIN");
			userService.addRoleToUser("cinzia", "ROLE_MANAGER");

		};


	}
*/
}
