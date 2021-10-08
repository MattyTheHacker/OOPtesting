package com.matty.testing;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Student {
    private final int id = new Random().nextInt();
    private String forename;
    private String surname;
    private LocalDate dateOfBirth;

    public int getId() {
        return id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setNameFromFullName(String fullName){
        for (int i = 0; i < fullName.length(); i++){
            if(fullName.charAt(i) == ' '){
                setForename(fullName.substring(0, i));
                setSurname(fullName.substring(i+1));
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}