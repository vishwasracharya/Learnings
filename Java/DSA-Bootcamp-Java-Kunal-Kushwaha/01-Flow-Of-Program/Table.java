package com.vishwasacharya;

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        int number, i, mul;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        number = input.nextInt();

        for (i = 1;i<=10;i++){
            mul = number*i;
            System.out.println(number + " x " + i + " = " + mul);
        }
    }
}
