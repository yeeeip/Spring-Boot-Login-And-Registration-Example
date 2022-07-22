package com.nuzhd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/")
public class MainController {

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

    @GetMapping
    public String getHomePage() {
        return "index";
    }
}
