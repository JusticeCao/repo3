package com.qf.cz.web.api.login.controller;

import com.qf.cz.web.api.login.service.UserService;
import com.qf.zsm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/checkLogin")
    public String checkLogin(User user, Model model) {

        user = userService.checkLogin(user.getLoginName(), user.getLoginPassword());
        if (user != null) {
            model.addAttribute("user", user);
            return "login_success";
        }
            return "fail";
    }

    @RequestMapping("/anotherpage")
    public String hrefpage(){

        return "anotherpage";
    }

    //注销方法
    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        session.invalidate();
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/doRegister")
    public String doRegister(User user,Model model){
        System.out.println(user.getLoginName());
        userService.insert(user);
        return "register_success";
    }
}
