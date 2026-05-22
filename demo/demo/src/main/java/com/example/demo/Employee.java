package com.example.demo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_ID")
    private Integer empId; // primary key

    private String name;
    private LocalDate birthdate;
    private String gender;
    private String hobbies;
    
    @Column(name = "address_1", length = 200)
    private String address1;

    
    @Column(name = "address_2", length = 200)
    private String address2;

    @Column(length = 100)
    private String city;
    @Column(length = 20)
    private String pincode;
    @Column(length = 20)
    private String pan;

    @Column(columnDefinition = "TEXT")
    private String photo;

    @Column(columnDefinition = "TEXT")
    private String addressProof;


    //empty Constructor
    public Employee() {}

    //parameterised Constructor
    public Employee(String name, LocalDate birthdate, String gender, String hobbies, String address1, String address2, String city, String pincode, String pan) {
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.hobbies = hobbies;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.pincode = pincode;
        this.pan = pan;
    }

    // setters and getters 
    public Integer getEmpId() { return empId; }
    public void setEmpId(Integer empId) { this.empId = empId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getBirthdate() { return birthdate; }
    public void setBirthdate(LocalDate birthdate) { this.birthdate = birthdate; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getHobbies() { return hobbies; }
    public void setHobbies(String hobbies) { this.hobbies = hobbies; }

    public String getAddress1() { return address1; }
    public void setAddress1(String address1) { this.address1 = address1; }

    public String getAddress2() { return address2; }
    public void setAddress2(String address2) { this.address2 = address2; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    public String getPan() { return pan; }
    public void setPan(String pan) { this.pan = pan; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public String getAddressProof() { return addressProof; }
    public void setAddressProof(String addressProof) { this.addressProof = addressProof; }
}