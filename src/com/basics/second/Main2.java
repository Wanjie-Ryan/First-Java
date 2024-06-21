package com.basics.second;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
//       declaring a constant

        final int speed = 40;
        double m = Math.random() * speed;

        System.out.println(m);

        Scanner sc = new Scanner(System.in);
        int wiko = sc.nextInt();
        System.out.println(wiko);

    }
}
