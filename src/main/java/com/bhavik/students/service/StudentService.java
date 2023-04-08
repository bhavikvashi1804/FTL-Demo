package com.bhavik.students.service;


import com.bhavik.students.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> studentList = new ArrayList<>();

    @PostConstruct
    public void addDummyData(){
        Student student1 = new Student("Meet Patel", 25);
        Student student2 = new Student("Raj Patel", 26);
        studentList.add(student1);
        studentList.add(student2);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
