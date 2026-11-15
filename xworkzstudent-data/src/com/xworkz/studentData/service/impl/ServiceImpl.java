package com.xworkz.studentData.service.impl;

import com.xworkz.studentData.dao.StudentDao;
import com.xworkz.studentData.dao.impl.DaoImpl;
import com.xworkz.studentData.dto.StudentDTo;
import com.xworkz.studentData.service.StudentService;

public class ServiceImpl implements StudentService {
    @Override
    public String saveStudentData(StudentDTo dto) {


        if(dto.getName()==null){
            return "Invalid Name";
        }

        if(dto.getEmail()==null){
            return "Invalid email";
        }

        if(dto.getUsn()==null){
            return "Invalid Usn";
        }

        if(dto.getPhone()==0){
            return "Invalid phone";

        }

        System.out.println("now we are in service");
        System.out.println(dto.getName());

        StudentDao dao=new DaoImpl();
        dao.saveStudentData( dto);





return "succsessfully";


    }


}
