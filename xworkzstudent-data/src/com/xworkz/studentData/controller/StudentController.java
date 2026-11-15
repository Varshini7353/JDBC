package com.xworkz.studentData.controller;

import com.xworkz.studentData.dto.StudentDTo;
import com.xworkz.studentData.service.StudentService;
import com.xworkz.studentData.service.impl.ServiceImpl;

public class StudentController {


    public void saveStudentData(StudentDTo dto) {
        System.out.println("Student data saved succesfully");

        System.out.println(dto.getName());

        StudentService service= new ServiceImpl();
        service.saveStudentData(dto);
    }
}
