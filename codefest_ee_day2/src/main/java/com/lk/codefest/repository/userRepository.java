package com.lk.codefest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lk.codefest.entity.user;

@Repository

public interface userRepository extends JpaRepository<user, Integer>  {
	
	

}
