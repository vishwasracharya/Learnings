package com.vishwas.assignments;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = in.nextInt();

        vote(age);
    }
    static int vote(int age){
        if(age >= 18){
            System.out.println("Yes, You are eligible to VOTE");
        }
        else {
            System.out.println("No, You are not eligible to VOTE");
        }
        return  0;
    }

}
