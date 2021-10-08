package com.matty.testing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your full name, with forename and surname seperated by a space.");
        String fullName = userInput.nextLine();
        student.setNameFromFullName(fullName);

        System.out.println("Enter your date of birth(dd/MM/yyyy)");
        String dateOfBirthString = userInput.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ENGLISH);
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, formatter);
        student.setDateOfBirth(dateOfBirth);
    }
}