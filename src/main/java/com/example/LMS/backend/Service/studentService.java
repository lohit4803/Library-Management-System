package com.example.LMS.backend.Service;

import com.example.LMS.backend.Enums.cardStatus;
import com.example.LMS.backend.Repository.studentRepository;
import com.example.LMS.backend.RequestDTO.StudentRequestDto;
import com.example.LMS.backend.models.Student;
import com.example.LMS.backend.models.card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class studentService
{
    @Autowired
    studentRepository st;

    @Autowired
    cardService cs;

    public String createStudent(StudentRequestDto studentRequestDto)
    {
        Student s = new Student();
        s.setAge(studentRequestDto.getAge());
        s.setEmail(studentRequestDto.getEmail());
        s.setCountry(studentRequestDto.getCountry());
        s.setName(studentRequestDto.getName());



        card c = new card();
        c.setCardstatus(cardStatus.Activated);
        c.setStudent(s);

        s.setCard1(c);

        st.save(s);

        return "successfully added student and card";
    }
}
