package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class SumOfEvenOddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] arr1 = new int[x];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        int EvenSum = 0;
        int OddSum = 0;


        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j]%2==0){
                EvenSum+=arr1[j];
            }
            else {
                OddSum+=arr1[j];
            }
        }

        System.out.println("The sum of the even numbers in the array is "+EvenSum);
        System.out.println("The sum of the odd numbers in the array is "+OddSum);

    }
}
