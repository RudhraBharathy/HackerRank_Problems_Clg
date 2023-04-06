package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class PrimeNumberSeris {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int x = 2; x <= n; x++) {
            int flg = 1;
            for (int y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1) {
                System.out.print(x + " ");
            }
        }
    }
}
