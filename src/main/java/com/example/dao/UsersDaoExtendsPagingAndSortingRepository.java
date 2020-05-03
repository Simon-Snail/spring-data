package com.example.dao;



import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.pojo.Users;

/**
 * PagingAndSortingRepository接口讲解
 */
public interface UsersDaoExtendsPagingAndSortingRepository extends PagingAndSortingRepository<Users, Integer>{
	
}
