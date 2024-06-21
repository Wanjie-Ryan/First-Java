package com.basics.calculator;

import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {

//        M = P[r(1+r)^n]/[(1+r)^n -1]

        float mortgage;
        int principal;
        float rate;
        int period;

        System.out.println("Enter the principal amount:");
        Scanner sc = new Scanner(System.in);
        principal = sc.nextInt();
        System.out.println("The principal amount is: " +principal);



    }
}
