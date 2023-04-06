package com.HackerRank_FacePrep;

import java.util.Scanner;

public class TwoSameArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[] arr1 = new int[x];
        int[] arr2 = new int[y];
        int arr1Sum  = 0;
        int arr2Sum  = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = in.nextInt();
        }

        if (x!=y){
            System.out.println("Not Same");
        }
        else if (x==y){
            for (int i = 0; i < arr1.length; i++) {
                arr1Sum += arr1[i];
            }
            for (int j = 0; j < arr2.length; j++) {
                arr2Sum += arr2[j];
            }
            if (arr1Sum==arr2Sum){
                System.out.println("Same");
            }
            else {
                System.out.println("Not Same");
            }
        }
    }
}
