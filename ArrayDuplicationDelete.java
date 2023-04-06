package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class ArrayDuplicationDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int arr1[] = new int[x];
        for (int k = 0; k < arr1.length; k++) {
            arr1[k] = in.nextInt();
        }
        int temp;

        for (int i = 0; i < arr1.length; i++) {
            temp = 0;
            for (int j = i; j >=0 ; j--) {
                if (arr1[i]==arr1[j]){
                    temp++;
                }
            }
            if (temp==1){
                System.out.println(arr1[i]);
            }
        }

    }
}
