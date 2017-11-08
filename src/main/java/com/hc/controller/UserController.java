package com.hc.controller;

import com.hc.pojo.User;
import com.hc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("userId"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
