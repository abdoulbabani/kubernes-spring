package com.example.springkubernetes.repository;

import com.example.springkubernetes.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositore extends JpaRepository<Student,Long> {
}
