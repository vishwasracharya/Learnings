package com.vishwasacharya.basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double pi = 3.14, area, radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = input.nextDouble();

        area = pi*(radius*radius);
        System.out.println("Area Of Circle is " + area);

    }
}
