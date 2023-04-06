package com.HackerRank_FacePrep;

import java.util.Scanner;

public class TrendyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        val = Math.abs(val);
        if (val>=100 && val<=999){
            int middleVal = (val/10)%10;
            if (middleVal%3==0){
                System.out.println("Trendy Number");
            }
            else{
                System.out.println("Not a Trendy Number");
            }
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
