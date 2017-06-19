package com.anindya.entity;

import javax.persistence.*;


@Entity
@Table(name = "COURSE_SCHEDULE")
public class CourseScheduling {

    @Id@GeneratedValue
    @Column(name = "ID")
    private Integer id;
    @Column(name="COURSE_ID")
    private Integer courseId;
    @Column(name = "COURSE_NAME")
    private String courseName;
    @Column(name = "TRAINNER_ID")
    private Integer trainnerID;
    @Column(name = "START_TIME")
    private String startTime;
    @Column(name = "NO_OF_DAYS")
    private Integer noOfDays;
    @Column(name="STUDENT_ID")
    private Integer studentId;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getTrainnerID() {
        return trainnerID;
    }

    public void setTrainnerID(Integer trainnerID) {
        this.trainnerID = trainnerID;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


}
