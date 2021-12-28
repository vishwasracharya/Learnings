package com.vishwasacharya.basic;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double area, width, length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = input.nextDouble();
        System.out.print("Enter length: ");
        length = input.nextDouble();

        area = width*length;
        System.out.println("Area Of Rectangle: " + area);
    }
}
