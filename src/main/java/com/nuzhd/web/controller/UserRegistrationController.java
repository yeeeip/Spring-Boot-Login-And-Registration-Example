package com.nuzhd.web.controller;

import com.nuzhd.service.impl.UserServiceImpl;
import com.nuzhd.web.dto.MyUserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/registration")
public class UserRegistrationController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public String getRegistrationPage(Model model) {
        model.addAttribute("user", new MyUserRegistrationDto());
        return "registration";
    }

    @PostMapping
    public String registerUser(MyUserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/api/v1/registration?success";
    }
}
