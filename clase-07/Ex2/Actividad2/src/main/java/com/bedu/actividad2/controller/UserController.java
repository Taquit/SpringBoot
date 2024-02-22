package com.bedu.actividad2.controller;

import com.bedu.actividad2.model.User;
import com.bedu.actividad2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("newUser", new User());
        return"index";

    }
    @PostMapping("/add")
    public String addUser(@ModelAttribute User newUser)
}
