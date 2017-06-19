package com.anindya.entity;

import javax.persistence.*;

/**
 * Created by jcon928 on 6/18/2017.
 */
@Entity
public class Course {
    @Id@GeneratedValue
    @Column(name = "COURSE_ID")
    private int courseId;
    @Column(name="COURSE_NAME")
    private String CourseName;
    @Column(name="NO_OF_LESSONS")
    private int noofLessons;
    @Column(name="DURATION")
    private String duration;

    @ManyToOne
    @JoinColumn(name = "trainerId")
    private Trainer trainer;

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return CourseName;
    }
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
    public int getNoofLessons() {
        return noofLessons;
    }
    public void setNoofLessons(int noofLessons) {
        this.noofLessons = noofLessons;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", CourseName=" + CourseName + ", noofLessons=" + noofLessons
                + ", duration=" + duration + "]";
    }




}
