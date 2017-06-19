package com.anindya.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jcon928 on 6/18/2017.
 */
@Entity
@Table(name = "SUPPORT_DEVELOPER")
public class SupportDeveloper {

    @Id@GeneratedValue
    @Column(name = "SPDEV_ID")
    private Integer supportDeveloperId;

    @Column(name = "SPDEV_NAME")
    private String supportDeveloperName;

    @Column(name = "EXP")
    private Integer experience;

    @OneToMany(mappedBy = "supportDeveloper",cascade = CascadeType.ALL)
    private List<Address> address;

    @OneToMany(mappedBy = "supportDeveloper",cascade = CascadeType.ALL)
    private List<Student> students;

    public Integer getSupportDeveloperId() {
        return supportDeveloperId;
    }

    public void setSupportDeveloperId(Integer supportDeveloperId) {
        this.supportDeveloperId = supportDeveloperId;
    }

    public String getSupportDeveloperName() {
        return supportDeveloperName;
    }

    public void setSupportDeveloperName(String supportDeveloperName) {
        this.supportDeveloperName = supportDeveloperName;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
