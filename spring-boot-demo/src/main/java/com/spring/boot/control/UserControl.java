package com.spring.boot.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Javion
 */
@Controller
public class UserControl {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "user control";
    }
}
