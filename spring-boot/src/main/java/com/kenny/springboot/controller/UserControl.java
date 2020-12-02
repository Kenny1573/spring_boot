package com.kenny.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author Kenny
 * @version 1.0
 * @description: TestControl
 * @date 2020/12/1 14:43
 */
@Controller
public class UserControl {
    /**
    * @description: Thyme leaf测试类
    * @return java.lang.String
    * @throws
    * @author Kenny
    * @date 2020/12/1 14:58
    */
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("hello","你好");
        return "hello";
    }
}
