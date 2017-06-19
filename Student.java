package com.anindya.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="STUDENT")
public class Student {

    @Id@GeneratedValue
    @Column(name = "STUDENT_ID")
    private Integer studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "EDU_DTL")
    private String educationDetails;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> address;

    @ManyToOne
    @JoinColumn(name = "supportDeveloperId")
    private SupportDeveloper supportDeveloper;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })
    private List<Course> courses;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_TRAINER", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "TRAINER_ID") })
    private List<Trainer> trainers;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(String educationDetails) {
        this.educationDetails = educationDetails;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public SupportDeveloper getSupportDeveloper() {
        return supportDeveloper;
    }

    public void setSupportDeveloper(SupportDeveloper supportDeveloper) {
        this.supportDeveloper = supportDeveloper;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }
}
