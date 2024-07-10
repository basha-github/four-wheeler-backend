package com.mtz.four.wheeler.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtz.four.wheeler.entity.LoginUser;

public interface LoginRepo extends JpaRepository<LoginUser, String> {

}
