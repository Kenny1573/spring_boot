package com.spring.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kenny
 */
@Controller
public class ImageController {
    @RequestMapping("/user")
    public String returnUser(){
        return "index";
    }
}
