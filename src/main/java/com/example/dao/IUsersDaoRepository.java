package com.example.dao;

import com.example.pojo.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUsersDaoRepository extends Repository<Users, Integer> {

    //根据命名规则查询
    List<Users> findByUsernameIs(String username);
    List<Users> findByUsernameLike(String username);
    List<Users> findByUsernameAndUserage(String username, Integer userage);

    //基于@Query注解查询 - JPQL
    @Query(value = "select username from Users where username = :username")
    List<Users> queryUsersByUsername(@Param("username") String username);
    @Query(value = "from Users where username = :username and userage = :userage")
    List<Users> queryUsersByUsernameAndUserage(@Param("username") String username, @Param("userage") Integer userage);

    //基于@Query注解查询 - SQL
    @Query(value = "select * from tb_users where username = ?", nativeQuery = true)
    List<Users> queryUsersByUsernameSQL(String username);


}
