package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int distance = (int)Math.sqrt(Math.pow(x-3,2)+Math.pow(y-4,2));
        System.out.println(distance);
    }
}
