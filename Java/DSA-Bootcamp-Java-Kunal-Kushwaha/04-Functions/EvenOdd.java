package com.vishwas.assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = in.nextInt();

        evenodd(num);
    }

    static int evenodd(int a){
        if(a % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        return 0;
    }
}
