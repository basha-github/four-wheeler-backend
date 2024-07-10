package com.mtz.four.wheeler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.four.wheeler.entity.LoginUser;
import com.mtz.four.wheeler.service.LoginService;

@RestController
@RequestMapping("/four/user")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public Boolean isUserValid(@RequestBody LoginUser loginUser){
		
		return false;
	}
	
	@PostMapping("/add")
	public LoginUser createUser(@RequestBody LoginUser loginUser) {
		
		return loginService.addNewUser(loginUser);
	}
	
	@GetMapping("/all")
	public List<LoginUser> getAllUsers(){
		return loginService.fetchAllUsers();
	}
	
	@DeleteMapping("/delete")
	public String deleteUser(@RequestParam String username) {
		
		return loginService.deleteUser(username);
	}
	

}
