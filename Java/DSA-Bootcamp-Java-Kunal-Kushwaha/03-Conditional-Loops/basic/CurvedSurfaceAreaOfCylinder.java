package com.vishwasacharya.basic;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        double pi=3.14, area, r, h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value Of Radius: ");
        r = input.nextDouble();
        System.out.print("Enter Value Of Height: ");
        h = input.nextDouble();

        area = 2*pi*r*h;
        System.out.println("Curved Surface Area Of Cylinder: " + area);
    }
}
