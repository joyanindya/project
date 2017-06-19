package com.anindya.dao;

import com.anindya.entity.Student;
import com.anindya.util.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by jcon928 on 6/18/2017.
 */
public class StudentDAOImpl implements StudentDAO{
    public boolean insertStudentRecords(Student student) throws Exception {
        if(student == null){
            throw new RuntimeException("Student is Not Defined or Student is null");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        // LOGGER.info(String.format("The Students Records Inserted Successfully  \n"));
        System.out.println("The Students Records Inserted Successfully  \n");
        session.close();
        return true;
    }

    public List<Student> getAllStudentRecords() throws Exception {
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Student.class);
        List <Student> studentList = criteria.list();
        transaction.commit();
        session.close();
        return studentList;
    }

    public Student getStudentRecordsByID(int studentId) throws Exception {
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(Student.class);
        criteria.add(Restrictions.eq("STUDENT_ID",studentId));
        Student StudentListById = (Student) criteria.list();
        transaction.commit();
        session.close();
        return StudentListById;
    }

    public boolean updateStudentRecords(Student student) throws Exception {
        if(student == null){
            throw new RuntimeException("Student is Not Defined or Student is null");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        //LOGGER.info(String.format("The Students Records Updated Successfully \n"));
        System.out.println("The Students Records Updated Successfully \n");
        session.close();
        return true;
    }

    public boolean deleteStudentRecords(int studentId) throws Exception {
        if(studentId == 0){
            throw new RuntimeException("Student Roll Number is not defined");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Student student = (Student) session.load(Student.class, new Integer(studentId));
        session.delete(student);
        transaction.commit();
        // LOGGER.info(String.format("The Students Records deleted Successfully \n"));
        System.out.println("The Students Records deleted Successfully \n");
        session.close();
        return true;
    }
}
