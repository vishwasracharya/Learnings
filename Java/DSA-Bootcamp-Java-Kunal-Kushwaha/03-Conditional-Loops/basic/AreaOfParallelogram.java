package com.vishwasacharya.basic;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        double area, base, height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();

        area = base*height;
        System.out.println("Area Of Parallelogram: " + area);
    }
}
