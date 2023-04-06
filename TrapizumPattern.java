package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class TrapizumPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int count1=0,count2=0;
        for(int i=x;i>=1;i--) {
            for(int j=x;j>i;j--) System.out.print("--");

            for(int k=1;k<=i;k++) System.out.print(++count1+"*");

            for(int l=1;l<=i;l++) {
                System.out.print(++count2+i*i);
                if(l!=i) System.out.print("*");
            }
            System.out.println();
        }
    }
}
