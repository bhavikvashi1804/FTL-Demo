package com.bhavik.students.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HomeController {

    @Bean
    public String getStudentName(){
        return "Bhavik Vashi";
    }



}
