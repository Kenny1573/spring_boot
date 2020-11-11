package spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 标注一个主程序类，说明是一个Spring Boot应用
 * SpringBootApplication
 *    @SpringBootConfiguration 表示这是一个Spring Boot配置类
 *      @Configuration配置类上的注解，也是容器中的一个组件
 *    @EnableAutoConfiguration 开启自动配置功能
 *      @AutoConfigurationPackage 自动配置包
 *      @Import(AutoConfigurationPackages.Registrar.class)：
        Spring的底层注解@Import，给容器中导入一个组件；导入的组件由AutoConfigurationPackages.Registrar.class；
 *  将主配置类（@SpringBootApplication修饰）所在包及所有子包组件扫描到Spring容器中
 */
@SpringBootApplication
public class HelloMain {
    public static void main(String[] args) {
        //让应用启动起来
        SpringApplication.run(HelloMain.class,args);
    }
}
