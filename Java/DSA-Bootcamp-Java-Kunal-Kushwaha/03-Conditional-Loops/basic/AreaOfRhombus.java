package com.vishwasacharya.basic;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        double area, p, q;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of p: ");
        p = input.nextDouble();
        System.out.print("Enter value of q: ");
        q = input.nextDouble();

        area = (p*q)/2;
        System.out.println("Area Of Rhombus: " + area);
    }
}
