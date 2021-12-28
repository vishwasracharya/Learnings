package com.vishwasacharya.firstJava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double inr, usd;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Amount in Rupees: ");
        inr =  input.nextDouble();

        usd = inr*0.013;
        System.out.println("Your Amount in USD is " + usd);

    }
}
