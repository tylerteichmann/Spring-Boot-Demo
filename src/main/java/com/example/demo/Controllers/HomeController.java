package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home Controller
 */
@Controller
@RequestMapping("/")
public class HomeController {

    public String getHome() {
        return "Welcome to the home page";
    }

}
