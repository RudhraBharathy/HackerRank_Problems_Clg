package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class CurrentBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int bill = 0;
        if (x<=200){
            bill = (int) (x*0.5);
            System.out.println("Rs."+bill);
        } else if (x<=400) {
            bill = (int) (x*0.65+100);
            System.out.println("Rs."+bill);
        }
        else if (x<=600) {
            bill = (int) (x*0.80+200);
            System.out.println("Rs."+bill);
        }
        else if (x>600) {
            bill = (int) (x*1.25+425);
            System.out.println("Rs."+bill);
        }
    }
}
