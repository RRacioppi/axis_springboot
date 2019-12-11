package com.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HomeController {
    @RequestMapping("/")
    public RedirectView handleFoo() {
        return new RedirectView("/services");
    }
}