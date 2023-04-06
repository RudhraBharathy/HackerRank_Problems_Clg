package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sqrVal = x*x;
        int lastVal= sqrVal%10;
        if (x==lastVal){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}
