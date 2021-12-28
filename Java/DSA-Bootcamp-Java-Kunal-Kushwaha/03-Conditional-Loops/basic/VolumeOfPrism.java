package com.vishwasacharya.basic;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        double vol, base, height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of Base area: ");
        base = input.nextDouble();
        System.out.print("Enter Value of height: ");
        height = input.nextDouble();

        vol = base*height;
        System.out.println("Volume Of Prism: " + vol);
    }
}
