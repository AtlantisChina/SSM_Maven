package com.atlantis.controller;

import com.atlantis.domain.User;
import com.atlantis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String Login(User user) {
        User loginUser = userService.LoginUser(user);
        if (loginUser != null) {
            return "forward:findAll";
        }
        return "forward:index.jsp";
    }

    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        System.out.println("SpringMVC配置成功...");
        List<User> users = userService.findAll();
        model.addAttribute("user",users);
        return "success";
    }
}
