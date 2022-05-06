package com.example.springkubernetes;

import com.example.springkubernetes.entities.Student;
import com.example.springkubernetes.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKubernetesApplication implements CommandLineRunner {
	private StudentService studentService;

	public SpringKubernetesApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringKubernetesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentService.AddStudent(Student.builder().name("babani").surname("abdoulkarim").build());
		studentService.AddStudent(Student.builder().name("abdoulaye").surname("cherif").build());

		studentService.getAllStudent().forEach(student -> {
			System.out.println(student.getName());
		});
	}
}
