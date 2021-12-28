package com.vishwasacharya;

import java.util.Scanner;

public class Hcf_Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number two: ");
        int num2 = sc.nextInt();
        sc.close();

        int temp1 = num1;
        int temp2 = num2;

        while (temp2 != 0){
            int temp =  temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        int hcf = temp1;
        int lcm = (num1*num2)/hcf;

        System.out.println(hcf);
        System.out.println(lcm);

    }
}
