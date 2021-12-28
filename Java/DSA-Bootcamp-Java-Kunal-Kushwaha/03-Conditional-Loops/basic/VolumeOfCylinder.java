package com.vishwasacharya.basic;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        double pi=3.14, vol, radius, height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of radius: ");
        radius = input.nextDouble();
        System.out.print("Enter Value of height: ");
        height = input.nextDouble();

        vol = pi*(radius*radius)*height;
        System.out.println("Volume Of Cylinder: " + vol);
    }
}
