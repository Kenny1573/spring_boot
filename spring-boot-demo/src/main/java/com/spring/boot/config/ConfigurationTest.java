package com.spring.boot.config;


import com.spring.boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MrGe
 *
 *  表明类是配置类，用来替代xml
 */
@Configuration
public class ConfigurationTest {

    @Bean
    public HelloService getHello(){
        System.out.println("配置类向容器中添加了组件");
        return new HelloService();
    }
}
