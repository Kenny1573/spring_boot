package com.spring.boot;

import com.spring.boot.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
//        System.out.println(person.toString());

    }

    @Test
    void logTest(){
        //记录器
        Logger logger = LoggerFactory.getLogger(getClass());
        //日志级别，由低到高
        //可以调整输出的日志级别，日志就只会在这个级别以后的高级级别生效
        logger.trace("这是trace日志");
        logger.debug("这是调试日志");
        //Spring Boot默认的日志级别
        logger.info("这是info日志");
        logger.warn("这是警告日志");
        logger.error("这是错误日志");

    }

}
