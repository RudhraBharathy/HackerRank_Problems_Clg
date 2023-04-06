package com.HackerRank_FacePrep;

import java.util.Scanner;

public class SpecialNumberes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        for (int i = m; i <= n; i++) {
            int firstVal = (int) (i/10);
            int lastVal = i%10;
            int sumOFDigits = firstVal+lastVal;
            int multiplyOFDigits = firstVal*lastVal;
            int totalVal = sumOFDigits+multiplyOFDigits;
            if (totalVal==i){
                System.out.println(i);
            }
        }
    }
}
