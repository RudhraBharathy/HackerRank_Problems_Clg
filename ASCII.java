package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float val = 54.5f;
        int val1 = (int)val;
        int val2 = (int) Math.ceil(val);
        int val3 = (int) Math.floor(val);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);

    }
}
