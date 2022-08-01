package com.laveces.genesis.controller;

import com.laveces.genesis.model.Student;
import com.laveces.genesis.repository.StudentRepository;
import com.laveces.genesis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("api/v1/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
