package com.spring.boot;

import com.spring.boot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Spring Boot单元测试
 */
@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    Person person;

//    @Autowired
//    People people;
    @Test
    void contextLoads() {

//        System.out.println(people.toString());
        System.out.println(person.toString());

    }

}
