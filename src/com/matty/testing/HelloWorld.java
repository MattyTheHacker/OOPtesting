package com.matty.testing;

import java.time.LocalDate;
import java.time.Period;
import java.util.Formatter;

public class HelloWorld {

    public void print(LocalDate dateOfBirth, String name){

        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();

        System.out.printf("Hello World! My name is %s", name);
        System.out.printf("\nMy age is %d", age);
    }

    public static void main(String[] args) {
        HelloWorld printer = new HelloWorld();
        String myName = "Matthew";
        LocalDate dateOfBirth = LocalDate.of(2002,3,25);
        printer.print(dateOfBirth, myName);
    }
}
