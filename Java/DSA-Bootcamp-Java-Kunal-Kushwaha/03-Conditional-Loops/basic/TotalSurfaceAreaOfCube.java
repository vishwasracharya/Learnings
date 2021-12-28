package com.vishwasacharya.basic;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        double area, a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value Of A(edge length of a cube): ");
        a = input.nextDouble();

        area = 6*a*a;
        System.out.println("Total Surface Area Of Cube: " + area);
    }
}
