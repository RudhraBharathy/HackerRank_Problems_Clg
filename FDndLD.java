package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class FDndLD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        int FD = val/1000;
        int LD = val%10;
        System.out.println(FD);
        System.out.println(LD);
    }
}
