package com.example.springkubernetes.service;

import com.example.springkubernetes.entities.Student;
import com.example.springkubernetes.repository.StudentRepositore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepositore studentRepositore;

    public StudentServiceImpl(StudentRepositore studentRepositore) {
        this.studentRepositore = studentRepositore;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepositore.findAll() ;
    }

    @Override
    public Student getSudentByIde(Long id) {
        return studentRepositore.getById(id);
    }

    @Override
    public Student AddStudent(Student student) {
        return studentRepositore.save(student);
    }

    @Override
    public void deletteStudentByide(Long id) {
        studentRepositore.deleteById(id);
    }
}
