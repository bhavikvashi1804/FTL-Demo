package com.bhavik.students.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "students")
public class StudentController {

    @GetMapping("/home")
    public String showHomePage(){
        return "home";
    }
}
