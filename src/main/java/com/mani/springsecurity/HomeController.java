package com.mani.springsecurity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @Value("${welcome.message}")
    private String message;

    @RequestMapping({"/home",""})
    public String name(Model model){
        model.addAttribute("message",message);
        return "home";
    }
}
