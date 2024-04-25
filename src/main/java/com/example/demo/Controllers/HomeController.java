package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home Controller
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String getHome() {
        return "Welcome to the home page";
    }

}
