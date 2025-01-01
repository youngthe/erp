package com.example.stock.erp.controller;

import com.example.stock.erp.dao.User;
import com.example.stock.erp.service.UserService;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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

    @GetMapping("/login")
    public String home() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, ServletRequest request) {
        User user = userService.authenticate(username, password);
        if (user != null) {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpSession session = req.getSession();
            session.setAttribute("user", user.getUsername());
            model.addAttribute("user", user);
            return "dashboard";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        User user = userService.authenticate("admin", "password");
        model.addAttribute("user", user);
        return "dashboard";
    }
}
