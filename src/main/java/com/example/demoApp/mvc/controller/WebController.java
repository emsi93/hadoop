package com.example.demoApp.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WebController {

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("login/login");
        return modelAndView;
    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("login/logout");
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("welcome");
    }

    @RequestMapping("/errorLogin")
    public ModelAndView errorView(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("login/error");
    }

}
