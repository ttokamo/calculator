package by.overone.it.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/{id}")
    public String showHomePage() {
        return "home-page";
    }
}
