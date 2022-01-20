package com.vishwas.assignments;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int first, second, third;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        first = in.nextInt();
        System.out.println("Enter First Number: ");
        second = in.nextInt();
        System.out.println("Enter First Number: ");
        third = in.nextInt();

        int maximum = maximum(first, second, third);
        int minimum = minimum(first, second, third);
        System.out.println("max is: " + maximum + " & min is: " + minimum);
    }
    static int maximum(int a, int b, int c){
        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }
    static int minimum(int a, int b, int c){
        int min = a;
        if (b<min){
            min =b;
        }
        if (c<min){
            min =c;
        }
        return min;
    }
}
