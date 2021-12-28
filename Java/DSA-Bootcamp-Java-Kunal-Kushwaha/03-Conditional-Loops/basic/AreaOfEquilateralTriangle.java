package com.vishwasacharya.basic;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        double a, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A(sides): ");
        a = input.nextDouble();

        area = (1.732/4)*(a*a);
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}
