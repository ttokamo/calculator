package by.overone.it.controllers;

import by.overone.it.pojo.User;
import by.overone.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    private User user;
    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String showRegisterPage() {
        return "register-page";
    }

    @PostMapping("/finish-registration")
    public String checkInputRegistrationData(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("repassword") String repassword) {
        user = userService.getUserByUsernameAndPassword(username, password);
        if (user == null) {
            userService.saveUser(username, password);
            return "redirect:/login";
        } else {
            return "redirect:/registration";
        }
    }

}
