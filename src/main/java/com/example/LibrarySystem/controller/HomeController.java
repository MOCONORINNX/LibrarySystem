package com.example.LibrarySystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //marks this class as a Spring MVC controller
public class HomeController {

    @RequestMapping(value = "/") //RequestMapping flags the index() method to support the /route
    public String index() {
        return "index"; //returns index as the name of the template, which Spring Boot's autoconfigured view resolver will map to src/main/resources/templates/index.html "index.html"
    }
}
