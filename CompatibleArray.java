package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class CompatibleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] arr1 = new int[x];
        for (int k = 0; k < arr1.length; k++) {
            arr1[k] = in.nextInt();
        }

        int y = in.nextInt();
        int[] arr2 = new int[y];
        for (int l = 0; l < arr2.length; l++) {
            arr2[l] = in.nextInt();
        }

        boolean flag = false;


        if (x==y){
            for (int i = 0; i < arr1.length && i < arr2.length; i++) {
                if (arr1[i]>=arr2[i]){
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
        }

        if (flag ){
            System.out.println("Compatible");
        }
        else if (!flag || x!=y){
            System.out.println("Incompatible");
        }


    }
}
