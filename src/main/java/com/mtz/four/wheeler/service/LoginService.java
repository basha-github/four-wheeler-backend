package com.mtz.four.wheeler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtz.four.wheeler.entity.LoginUser;
import com.mtz.four.wheeler.repo.LoginRepo;

@Service
public class LoginService {

	@Autowired
	LoginRepo loginRepo;
	
	
	public LoginUser addNewUser(LoginUser loginUser) {
		return loginRepo.save(loginUser);
	}


	public List<LoginUser> fetchAllUsers() {
	
		return loginRepo.findAll();
	}

}
