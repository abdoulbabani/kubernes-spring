package com.example.springkubernetes.service;

import com.example.springkubernetes.entities.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudent();
  Student getSudentByIde(Long id);
    Student AddStudent(Student student);
    void deletteStudentByide(Long id);
}
