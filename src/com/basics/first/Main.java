package com.basics.first;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int age = 30;
        int views = 145_768;
        double decNum = 12.44;
        boolean isAdult = false;
//        float floNum = 12.4455f;

        Date now = new Date();
        System.out.println(now);
        now.getYear();

        String text = "my name is ryan";
        String conc = text + "I am wewe years";
        System.out.println(conc);


        System.out.println(age);
        System.out.println(views);

        int [] myarr= {1,2,3,4,5,6 };
        System.out.println(myarr[2]);

        System.out.println(myarr.length);
        Arrays.sort(myarr);

        System.out.println(Arrays.toString(myarr));



    }
}