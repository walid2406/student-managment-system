package com.fullproject.walidtech.studentmanagmentsystem.repository;

import com.fullproject.walidtech.studentmanagmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository <Student, Long> {


}
