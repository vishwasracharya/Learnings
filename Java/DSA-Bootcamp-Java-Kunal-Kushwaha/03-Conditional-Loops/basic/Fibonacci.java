package com.vishwasacharya.basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter vlaue of N to find Fibonacci No: ");
        int n = in.nextInt();
        int a=0, b=1, count=2;

        while (count <= n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println("Fibonacci No of " + n + " = " + b);
    }
}
