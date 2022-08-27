package com.model;

import java.time.LocalDate;

public class PersonForm {
    private String firstname;
    private String lastname;
    private Long mobile;
    private LocalDate birthDate;

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person(Firstname:"+this.firstname+",Lastname:"+this.lastname+",Mobile:"+this.mobile+",Date of Birth:"+this.birthDate;
    }
}
