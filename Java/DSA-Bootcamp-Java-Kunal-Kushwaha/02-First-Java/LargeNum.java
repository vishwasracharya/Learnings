package com.vishwasacharya.firstJava;

import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        a = input.nextInt();
        System.out.println("Enter value of B: ");
        b = input.nextInt();

        if (a>b){
            System.out.println("A is Large");
        }else {
            System.out.println("B is Large");
        }
    }
}
