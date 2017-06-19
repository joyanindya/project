package com.anindya.dao;

import com.anindya.entity.CourseScheduling;

import java.util.List;

/**
 * Created by jcon928 on 6/18/2017.
 */
public interface CourseSchedulingDAO {

    boolean insertCourseSchedulingRecords(CourseScheduling courseScheduling) throws Exception;
    List<CourseScheduling> getAllCourseSchedulingRecords() throws Exception;
    CourseScheduling getCourseSchedulingByID(int courseId) throws Exception;
    boolean updateCourseSchedulingRecords(CourseScheduling courseScheduling) throws Exception;
    boolean deleteCourseSchedulingRecords(int courseId) throws Exception;

}
