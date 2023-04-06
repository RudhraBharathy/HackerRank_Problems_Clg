package com.HackerRank_FacePrep;

import java.util.Scanner;
 public class TreasureFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int min = Math.min(num1, Math.min(num2, num3));
        if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2)
            System.out.println("The treasure is in the box which has the number "+num1);
        else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1)
            System.out.println("The treasure is in the box which has the number "+num2);
        else
            System.out.println("The treasure is in the box which has the number "+num3);
        int i;
        for (i = min; i >= 1; i--) {
            if ((num1 % i == 0) && (num2 % i == 0) && (num3 % i == 0)) {
                break;
            }
        }

        System.out.println("The code to open the box is "+i);

    }
}
