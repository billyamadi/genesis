package com.laveces.genesis.service;

import com.laveces.genesis.model.Student;
import com.laveces.genesis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
/*
    @Autowired
    private StudentRepository repository;
    //saves one student record
    public Student saveStudent(Student student){
        return repository.save(student);
    }
    //saves a list of students
    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }
    //Get all students
    public List<Student> getStudents(){
        return repository.findAll();
    }
    //Get student by their ID
    public Student getStudentbyID(int id){
        return repository.findById(id).orElse(null);
    }
    //Get student by their name
    public List<Student> getStudentbyName(String name){
        return repository.findByName(name);
    }
    //Delete student
    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student with id";
    }*/

}
