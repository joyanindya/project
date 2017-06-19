package com.anindya.dao;


import com.anindya.entity.CourseScheduling;
import com.anindya.util.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CourseSchedulingDAOImpl implements CourseSchedulingDAO{


    public boolean insertCourseSchedulingRecords(CourseScheduling courseScheduling) throws Exception {
        if(courseScheduling == null){
            throw new RuntimeException("Course Scheduling is Not Defined or Course Scheduling is null");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(courseScheduling);
        transaction.commit();
        // LOGGER.info(String.format("The Students Records Inserted Successfully  \n"));
        System.out.println("The Course Scheduling Records Inserted Successfully  \n");
        session.close();
        return true;
    }

    public List<CourseScheduling> getAllCourseSchedulingRecords() throws Exception {
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(CourseScheduling.class);
        List <CourseScheduling> courseSchedulingList = criteria.list();
        transaction.commit();
        session.close();
        return courseSchedulingList;
    }

    public CourseScheduling getCourseSchedulingByID(int courseId) throws Exception {
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(CourseScheduling.class);
        criteria.add(Restrictions.eq("COURSE_ID",courseId));
        CourseScheduling courseSchedulingListById = (CourseScheduling)criteria.list();
        transaction.commit();
        session.close();
        return courseSchedulingListById;
    }

    public boolean updateCourseSchedulingRecords(CourseScheduling courseScheduling) throws Exception {
        if(courseScheduling == null){
            throw new RuntimeException("Course Scheduling is Not Defined or Course Scheduling is null");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(courseScheduling);
        transaction.commit();
        //LOGGER.info(String.format("The Students Records Updated Successfully \n"));
        System.out.println("The Course Scheduling Records Updated Successfully \n");
        session.close();
        return true;
    }

    public boolean deleteCourseSchedulingRecords(int courseId) throws Exception {
        if(courseId == 0){
            throw new RuntimeException("Course id is not defined");
        }
        Session session = HibernateSessionFactory.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        CourseScheduling courseScheduling = (CourseScheduling) session.load(CourseScheduling.class, new Integer(courseId));
        session.delete(courseScheduling);
        transaction.commit();
        // LOGGER.info(String.format("The Students Records deleted Successfully \n"));
        System.out.println("TThe Course Scheduling Records deleted Successfully \n");
        session.close();
        return true;
    }
}
