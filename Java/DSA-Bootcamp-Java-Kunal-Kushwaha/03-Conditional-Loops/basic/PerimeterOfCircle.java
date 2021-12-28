package com.vishwasacharya.basic;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        double pi=3.14, peri, radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of radius: ");
        radius = input.nextDouble();

        peri = 2*pi*radius;
        System.out.println("Perimeter Of Circle: " + peri);
    }
}
