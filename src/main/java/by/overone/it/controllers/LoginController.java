package by.overone.it.controllers;

import by.overone.it.pojo.User;
import by.overone.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private User user;

    @GetMapping({"/","login1"})
    public String showLoginPage() {
        return "login-page";
    }

    @PostMapping("/finish-login")
    public String checkInputLoginData(
            @RequestParam("username") String username,
            @RequestParam("password") String password)
    {
        user = userService.getUserByUsernameAndPassword(username, password);
        if (user != null) {
            return "redirect:/" + user.getId();
        } else {
            return "redirect:/login";
        }
    }
}
