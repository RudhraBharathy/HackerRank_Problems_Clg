package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class AmoebaMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(),a = 0,b = 1,c;
        for (int i = 1;i < m;i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
