package com.vishwasacharya.basic;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        double peri, length, width;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of length: ");
        length = input.nextDouble();
        System.out.print("Enter Value of width: ");
        width = input.nextDouble();

        peri = 2*(length+width);
        System.out.println("Perimeter Of Rectangle: " + peri);
    }
}
