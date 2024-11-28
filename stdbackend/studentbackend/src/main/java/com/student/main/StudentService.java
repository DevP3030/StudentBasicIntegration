package com.student.main;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
    private final StudentRepository studentRepository;

    public String addStudent(String name,int age) 
    {
    	Student student = new Student(name, age);
    	studentRepository.save(student);
        return "Student Add";
    }
    
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}


