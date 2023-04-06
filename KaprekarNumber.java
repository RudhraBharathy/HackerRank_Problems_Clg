package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean Kaprekar = false;
        int sqrVal = x*x;
        int temp = sqrVal,contDigits = 0;
        while (temp > 0)
        {
            contDigits++;
            temp /= 10;
        }

        for (int i = 1; i < contDigits; i++)
        {
            int divisor = (int) Math.pow(10, i);
            int quotient = sqrVal / divisor;
            int remainder = sqrVal % divisor;
            if (quotient + remainder == x)
            {
                Kaprekar = true;
            }
        }

        if (Kaprekar){
            System.out.println("Kaprekar Number");
        }
        else {
            System.out.println("Not a Kaprekar Number");
        }

    }
}
