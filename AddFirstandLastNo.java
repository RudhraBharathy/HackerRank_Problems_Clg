package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class AddFirstandLastNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 2002;
//        String val = String.valueOf(x);
//        char firstVal = val.charAt(0);
//        char secondVal = val.charAt(val.length()-1);
//        int i = Integer.parseInt(String.valueOf(firstVal));
//        int j = Integer.parseInt(String.valueOf(secondVal));
//        System.out.println(i+j);
        int firstDigit = x%10;
        while (x>=10){
            x /= 10;
        }
        int lastDigit = x;
        System.out.println(firstDigit+lastDigit);
    }
}
