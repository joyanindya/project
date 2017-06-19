package com.anindya.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jcon928 on 6/18/2017.
 */
@Entity
@Table(name = "TRAINER")
public class Trainer {

    @Id@GeneratedValue
    @Column(name="TRAINER_ID")
    private Integer trainerId;
    @Column(name = "TRAINER_NAME")
    private String trainerName;
    @Column(name = "YR_OF_EXP")
    private Integer yearOfExperience;
    @OneToMany(mappedBy = "trainer",cascade = CascadeType.ALL)
    private List<Address> address;

    @OneToMany(mappedBy = "trainer",cascade = CascadeType.ALL)
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public Integer getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(Integer yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}

