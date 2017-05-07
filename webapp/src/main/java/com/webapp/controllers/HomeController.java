package com.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tahsin on 2017-05-07.
 */
@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "Welcome Home!";
    }
}
