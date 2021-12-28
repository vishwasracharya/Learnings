package com.vishwasacharya.basic;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        double pi=3.14, vol, height, radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of Height: ");
        height = input.nextDouble();
        System.out.print("Enter Value of Radius: ");
        radius = input.nextDouble();

        vol = pi*(radius*radius)*(height/3);
        System.out.println("Volume Of Cone: " + vol);
    }
}
