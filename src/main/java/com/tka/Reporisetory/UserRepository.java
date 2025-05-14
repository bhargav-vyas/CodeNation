package com.tka.Reporisetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
