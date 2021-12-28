package com.vishwasacharya.firstJava;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        int a, b, sum, sub, multiply, divide;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        a = input.nextInt();
        System.out.println("Enter value of B: ");
        b = input.nextInt();

        sum = a+b;
        System.out.println("Summation: " + sum);

        multiply = a*b;
        System.out.println("Multiplication: " + multiply);

        if (a>b){
            sub = a-b;
            divide = a/b;
            System.out.println("Subtraction: " + sub);
            System.out.println("Division: " + divide);
        }else{
            sub = b-a;
            divide = b/a;
            System.out.println("Subtraction: " + sub);
            System.out.println("Division: " + divide);
        }
    }
}
