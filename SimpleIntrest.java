package com.HackerRank_FacePrep;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        float Si = x*y*z/100f;
        float val1 = Si;
        float val2 = x+val1;
        float val3 = x*0.02f;
        float val4 = val2-val3;
        System.out.printf("%.2f\n",val1);
        System.out.printf("%.2f\n",val2);
        System.out.printf("%.2f\n",val3);
        System.out.printf("%.2f\n",val4);

    }
}
