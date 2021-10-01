package com.matty.testing;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static void logPrint(String printedString){
        logger.log(Level.INFO,printedString + " has been printed.");
    }

    private static void logInput(String inputtedString){
        logger.log(Level.INFO,inputtedString + "has been inputted.");
    }

    public static int calculateAge(LocalDate dateOfBirth){
        try {
            return Period.between(dateOfBirth, LocalDate.now()).getYears();
        } catch(IllegalArgumentException e) {
            System.out.println("Code: " + e.getCause() + "Threw Exception: " + e.getMessage());
            logger.log(Level.WARNING, "Exception: " + e);
            return 0;
        }
    }

    public void print(LocalDate dateOfBirth, String name){

        int age = calculateAge(dateOfBirth);

        String helloWorldName = "Hello World! My name is " + name;
        System.out.println(helloWorldName);
        logPrint(helloWorldName);

        String myAge = "I am " + age + " years old.";
        System.out.println(myAge);
        logPrint(myAge);
    }

    public static void main(String[] args) {
        HelloWorld printer = new HelloWorld();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String myName = userInput.nextLine();
        logInput(myName);

        System.out.println("Enter your date of birth(dd/MM/yyyy):");
        String dateOfBirthString = userInput.nextLine();
        logInput(dateOfBirthString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        formatter = formatter.withLocale(Locale.ENGLISH);
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, formatter);

        printer.print(dateOfBirth, myName);
    }
}
