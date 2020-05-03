package com.example.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Users;

/**
 * JpaRepository接口讲解
 */
public interface UsersDaoExtendsJpaRepository extends JpaRepository<Users, Integer>{
	
}
