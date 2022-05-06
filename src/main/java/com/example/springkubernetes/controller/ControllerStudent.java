package com.example.springkubernetes.controller;


import com.example.springkubernetes.entities.Student;
import com.example.springkubernetes.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Students")
public class ControllerStudent {
    private StudentService studentService;

    public ControllerStudent(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        return new ResponseEntity<Student>(studentService.getSudentByIde(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addStudents(@RequestBody Student student){

        return  new ResponseEntity<Student>(studentService.AddStudent(student),HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public  void deleteStudent(@PathVariable Long id){
        studentService.deletteStudentByide(id);
    }



}
