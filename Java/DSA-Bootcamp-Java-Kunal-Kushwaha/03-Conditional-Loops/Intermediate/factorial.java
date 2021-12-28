package com.vishwasacharya.intermediate;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
//        n! = n * (n-1)! Formula
        long n, i, fact=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        n = input.nextLong();

        for (i=1; i<=n ; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + n + " is " + fact);

    }
}
