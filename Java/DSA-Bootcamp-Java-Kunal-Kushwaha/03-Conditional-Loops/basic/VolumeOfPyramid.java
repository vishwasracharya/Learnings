package com.vishwasacharya.basic;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        double vol, l, w, h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value Of Base Length: ");
        l = input.nextDouble();
        System.out.print("Enter Value Of Base Width: ");
        w = input.nextDouble();
        System.out.print("Enter Value Of Height: ");
        h = input.nextDouble();

        vol = (l*w*h)/3;
        System.out.println("Volume Of Pyramid: " + vol);
    }
}
