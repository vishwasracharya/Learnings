package com.vishwasacharya.firstJava;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        int si, p, r, t;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of P: ");
        p = input.nextInt();
        System.out.println("Enter value of R: ");
        r = input.nextInt();
        System.out.println("Enter value of T: ");
        t = input.nextInt();

        si = p* (1 + r*t);
        System.out.println("Simple Intrest = " + si);
    }
}
