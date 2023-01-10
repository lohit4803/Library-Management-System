package com.example.LMS.backend.Controller;

import com.example.LMS.backend.RequestDTO.StudentRequestDto;
import com.example.LMS.backend.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class studentController
{
    @Autowired
    studentService st;
    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody()StudentRequestDto studentRequestDto)
    {
        String s = st.createStudent(studentRequestDto);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

}
