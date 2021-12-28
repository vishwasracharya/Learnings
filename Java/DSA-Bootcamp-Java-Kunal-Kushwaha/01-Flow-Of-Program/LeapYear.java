package com.vishwasacharya;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Year: ");
        year = input.nextInt();

        if (year % 4 != 0) {
            System.out.println("It's NOT a Leap Year");
        } else {
            System.out.println("It is a Leap Year");
        }
    }
}
