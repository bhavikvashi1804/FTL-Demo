package com.bhavik.students.controller;


import com.bhavik.students.model.Car;
import com.bhavik.students.model.Student;
import com.bhavik.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String showHomePage(){
        return "home";
    }

    @GetMapping("/cars")
    public String showCars(@ModelAttribute("model") ModelMap model) {
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Alto", "CNG"));
        carList.add(new Car("i20", "Petrol"));
        model.addAttribute("carList", carList);
        return  "cars";
    }

    @GetMapping("/users")
    public String showUsers(Model model){
        String name = "Bhavik";
        model.addAttribute("username", name);
        return "users";
    }

    @GetMapping("/students")
    public String showStudents(Model model){
        List<Student> students = studentService.getStudentList();
        model.addAttribute("students", students);
        return "students";
    }


}
