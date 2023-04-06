package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class CountDistinctElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int count = 1;
        int[] arr = new int[x];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = in.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]==arr[i+1]){
                continue;
            }
            else {
                count++;
            }
        }
        System.out.println("There are " + count + " distinct element in the array.");


    }
}
