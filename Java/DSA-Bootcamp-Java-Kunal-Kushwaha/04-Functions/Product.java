package com.vishwas.assignments;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Value of A: ");
        int num1 = in.nextInt();
        System.out.print("Enter Value of B: ");
        int num2 = in.nextInt();

        int ans = product(num1, num2);
        System.out.print("A*B = " + ans);
    }
    static int product(int a, int b){
        return a * b;
    }
    }
