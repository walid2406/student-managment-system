package com.fullproject.walidtech.studentmanagmentsystem.controller;

import com.fullproject.walidtech.studentmanagmentsystem.entity.Student;
import com.fullproject.walidtech.studentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

   //handler method list students and return model and view
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        //create student object to hold student from data
        Student student=new Student();
        model.addAttribute("student",student);
        return "create_student";
    }


    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping ("students/edit/{id}")
    public String editStudentForm(@PathVariable Long id,Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
        @ModelAttribute("student") Student student, Model model){
        Student existingStudent=studentService.getStudentById(id);
        //updating student
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }


}