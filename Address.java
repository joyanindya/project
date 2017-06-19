package com.anindya.entity;

import javax.persistence.*;

/**
 * Created by jcon928 on 6/4/2017.
 */
@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id@GeneratedValue
    @Column(name ="ADDR_ID")
    private Integer addressId;
    @Column(name = "ST_HS_NO")
    private int houseNumber;
    @Column(name = "ST_STREET_NM")
    private String streetName;
    @Column(name = "ST_CITY")
    private String city;
    @Column(name = "PH_NO")
    private Integer phoneNumber;
    @Column(name = "EMAIL_ADDRS")
    private String emailAddress;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "supportDeveloperId")
    private SupportDeveloper supportDeveloper;

    @ManyToOne
    @JoinColumn(name = "trainerId")
    private Trainer trainer;

    public Address() {
    }

    public Address(int houseNumber, String streetName, String city) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public SupportDeveloper getSupportDeveloper() {
        return supportDeveloper;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setSupportDeveloper(SupportDeveloper supportDeveloper) {
        this.supportDeveloper = supportDeveloper;


    }
}
