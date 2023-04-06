package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class Midpoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1 = in.nextInt();
        float y1 = in.nextInt();
        float x2 = in.nextInt();
        float y2 = in.nextInt();
        float meanX = (x1+x2)/2;
        float meanY = (y1+y2)/2;
        System.out.println(meanX+" "+meanY);
    }
}
