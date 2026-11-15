package com.xworkz.studentData.runner;

import com.xworkz.studentData.controller.StudentController;
import com.xworkz.studentData.dto.StudentDTo;

public class Runner {

    public static void main(String[] args) {

        String name;
        String usn;
        String email;
        long phone;
        String college;
        String address;
        int age;


        name="Varsha";
        usn="1CG222CS120";
        email="varsha@gmail.com";
        phone=9876789L;
        college="CIT";
        address="Madhugiri";
        age=21;


        StudentController controller=new StudentController();
        //controller.saveStudentData(name,usn,email,phone,college,address,age);

        StudentDTo dto = new StudentDTo();
        dto.setName("Abhi");
        dto.setUsn("a133");
        dto.setEmail("abhi@gmail.com");
        dto.setPhone(765789L);
        dto.setCollege("Vidyavahini");
        dto.setAddress("Tumkur");
        dto.setAge(20);

        controller.saveStudentData( dto);



    }
}
