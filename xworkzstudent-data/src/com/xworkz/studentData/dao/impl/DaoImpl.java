package com.xworkz.studentData.dao.impl;

import com.xworkz.studentData.dao.StudentDao;
import com.xworkz.studentData.dto.StudentDTo;

public class DaoImpl implements StudentDao {
    @Override

    public void saveStudentData(StudentDTo dto) {

        System.out.println("Dao layer");

        System.out.println(dto.getName());
    }

}
