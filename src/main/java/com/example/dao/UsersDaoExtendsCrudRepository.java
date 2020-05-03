package com.example.dao;

import com.example.pojo.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * CrudRepository接口讲解
 */
public interface UsersDaoExtendsCrudRepository extends CrudRepository<Users, Integer> {

}
