package com.HackerRank_FacePrep;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int checkVal = x;
        int temp,factval = 0;
        while (x>0){
            temp = x%10;
            int singleFactVal=1;
            for (int i = 1; i <= temp; i++) {
                singleFactVal*=i;
            }
            factval += singleFactVal;
            x = x/10;
        }

        System.out.println(checkVal == factval ? "Yes" : "No");
    }
}
