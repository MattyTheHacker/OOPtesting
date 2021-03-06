package com.matty.testing;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Student extends Person {
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

    public void setNameFromFullName(String fullName) {
        int lastSpaceIndexInFullName = fullName.lastIndexOf(' ');
        setForename(fullName.substring(0, lastSpaceIndexInFullName));
        setSurname(fullName.substring(lastSpaceIndexInFullName + 1));
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

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}