package com.vishwasacharya.basic;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        double peri, a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of A(Side): ");
        a = input.nextDouble();

        peri = 3*a;
        System.out.println("Perimeter Of Equilateral Triangle: " +peri);
    }
}
