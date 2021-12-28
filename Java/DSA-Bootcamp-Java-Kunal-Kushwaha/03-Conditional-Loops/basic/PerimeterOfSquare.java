package com.vishwasacharya.basic;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        double peri, a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value Of a: ");
        a = input.nextDouble();

        peri = 4*a;
        System.out.println("Perimeter Of Square: " + peri);
    }
}
