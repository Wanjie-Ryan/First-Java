package com.basics.calculator;

import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {

//        M = P[r(1+r)^n]/[(1+r)^n -1]

        double mortgage;
        int principal;
        double AnnualRate = 0.18;
        double monthlyRate = AnnualRate /12;
        int period;


        System.out.println("Enter the principal amount:");
        Scanner sc = new Scanner(System.in);
        principal = sc.nextInt();
        System.out.println("The principal amount is: " +principal);

        System.out.println("Enter the period you will take to repay the mortgage:");
        Scanner so = new Scanner(System.in);
        period = so.nextInt();
        System.out.println("The period is: " +period);

        mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, period)) / (Math.pow(1 + monthlyRate, period) - 1);

        System.out.println("The mortgage is: " +mortgage);



    }
}
