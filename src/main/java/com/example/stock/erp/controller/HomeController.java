package com.example.stock.erp.controller;

import com.example.stock.erp.dao.User;
import com.example.stock.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello, Spring Boot!");
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {
        User user = userService.authenticate(username, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "dashboard";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }
}
