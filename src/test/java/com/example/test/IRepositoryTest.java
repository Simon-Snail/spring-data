package com.example.test;

import com.example.dao.IUsersDaoRepository;
import com.example.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class IRepositoryTest {

    @Autowired
    private IUsersDaoRepository iUsersDaoRepository;

    @Test
    public void test1() {
        List<Users> users = this.iUsersDaoRepository.findByUsernameIs("汪鹭");
        for (Users u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void test2() {
        List<Users> users = this.iUsersDaoRepository.findByUsernameLike("张%");
        for (Users u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void test3() {
        List<Users> users = this.iUsersDaoRepository.findByUsernameAndUserage("汪鹭", 24);
        for (Users u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void test4() {
        List<Users> users = this.iUsersDaoRepository.queryUsersByUsername("汪鹭");
        for (Users u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void test5() {
        List<Users> users = this.iUsersDaoRepository.queryUsersByUsernameAndUserage("汪鹭", 22);
        for (Users u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void test6() {
        List<Users> users = this.iUsersDaoRepository.queryUsersByUsernameSQL("汪鹭");
        for (Users u : users) {
            System.out.println(u);
        }
    }
}
