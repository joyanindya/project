package com.anindya.dao;



import com.anindya.entity.Student;

import java.util.List;

/**
 * Created by jcon928 on 6/18/2017.
 */
public interface StudentDAO {

    boolean insertStudentRecords(Student student) throws Exception;
    List<Student> getAllStudentRecords() throws Exception;
    Student getStudentRecordsByID(int studentId) throws Exception;
    boolean updateStudentRecords(Student student) throws Exception;
    boolean deleteStudentRecords(int studentId) throws Exception;

}
