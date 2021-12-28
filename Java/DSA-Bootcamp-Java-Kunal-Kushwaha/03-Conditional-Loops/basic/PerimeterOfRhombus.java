package com.vishwasacharya.basic;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        double peri, a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value Of a: ");
        a = input.nextDouble();

        peri = 4*a;
        System.out.println("Perimeter Of Rhombus: " + peri);
    }
}
