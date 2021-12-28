package com.vishwasacharya.basic;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        double peri, a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of A: ");
        a = input.nextDouble();
        System.out.print("Enter Value of B: ");
        b = input.nextDouble();

        peri = 2*(a+b);
        System.out.println("Perimeter Of Parallelogram:" + peri);
    }
}
