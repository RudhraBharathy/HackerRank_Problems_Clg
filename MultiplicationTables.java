package com.HackerRank_FacePrep;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        System.out.println("Enter m");
        int m = in.nextInt();

        System.out.println("The multiplication table of "+ n +" is");
        for (int i = 1; i <= m; i++) {
            int temp = i*n;
            System.out.println(i+"*"+n+"="+temp);
        }
    }
}
