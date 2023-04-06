package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int arr1[] = new int[x];
        for (int k = 0; k < arr1.length; k++) {
            arr1[k] = in.nextInt();
        }

        int pos = in.nextInt();

        if (pos > arr1.length){
            System.out.println("Invalid Input");
        }
        else {
            int ele = in.nextInt();
            System.out.println("Array after insertion is");
            for (int i = 0; i < arr1.length; i++) {
                if (i==pos-1){
                    System.out.println(ele);
                }
                System.out.println(arr1[i]);
            }
        }
    }
}
