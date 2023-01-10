package com.example.LMS.backend.Repository;

import com.example.LMS.backend.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.soap.SAAJResult;

public interface studentRepository extends JpaRepository<Student,Integer> {

}
