package com.fullproject.walidtech.studentmanagmentsystem.service;

import com.fullproject.walidtech.studentmanagmentsystem.entity.Student;

import java.util.List;

public interface StudentService {

     List<Student> getAllStudents();
     Student saveStudent(Student student);

     Student updateStudent(Student student);
     Student getStudentById(Long id);
     void deleteStudentById(Long id);
}
