package edu.csulb.tacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Taco Application! 🎉";
    }

    @GetMapping("/tacos")
    public String getTacos() {
        return "Here are your delicious tacos! 🌮";
    }
}