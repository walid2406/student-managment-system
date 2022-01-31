package com.fullproject.walidtech.studentmanagmentsystem;

import com.fullproject.walidtech.studentmanagmentsystem.entity.Student;
import com.fullproject.walidtech.studentmanagmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;


	@Override
	public void run(String... args) throws Exception {

		/*Student student=new Student("walid","abboud","walid@gmail.com");
		Student student2=new Student("walid2","abboud2","walid2@gmail.com");
		Student student3=new Student("walid3","abboud3","walid3@gmail.com");
		studentRepository.save(student);
		studentRepository.save(student2);
		studentRepository.save(student3);*/




	}

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);




	}

}
