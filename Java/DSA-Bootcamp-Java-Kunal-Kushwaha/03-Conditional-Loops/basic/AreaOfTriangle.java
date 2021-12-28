package com.vishwasacharya.basic;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        double area, base, height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();

        area = (base*height)/2;
        System.out.println("Area Of Triangle: " + area);
    }
}

