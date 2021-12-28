package com.vishwasacharya.basic;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double pi=3.14, vol, radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value if radius: ");
        radius = input.nextDouble();

        vol = 1.34*(pi*radius*radius*radius);
        System.out.println("Volume Of Sphere: " + vol);
    }
}
