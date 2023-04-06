package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();

        if (year>=1900 && year<=9999 && month>=1 && month<=12){
            if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                }
            }
            else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                System.out.println("31 Days");
            }
            else {
                System.out.println("30 Days");
            }
        }
        else {
            System.out.println(0);
        }
    }
}
