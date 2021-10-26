package com.matty.testing;

public class QuizTesting {
    public static void main(String[] args) {
        System.out.println("Begin Testing...");


        int x = 0;
        int s = 0;
        int n = 10000;

        while (x < n){
            x++;
            s = s + 2 * x - 1;
            if (s == x * x){
                System.out.println("x = " + x);
                System.out.println("s = " + s);
                System.out.println("==============");
            } else {
                System.out.println("False.");
                break;
            }
        }
        System.out.println("Done.");
    }
}
