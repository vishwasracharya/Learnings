package com.vishwas.assignments;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Value of A: ");
        int num1 = in.nextInt();
        System.out.print("Enter Value of B: ");
        int num2 = in.nextInt();

        int ans = sum(num1, num2);
        System.out.print("A+B = " + ans);
    }
    static int sum(int a, int b){
        return a + b;
    }
}
