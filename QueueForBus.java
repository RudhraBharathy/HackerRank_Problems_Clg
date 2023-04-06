package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class QueueForBus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[] = new int[n];
        int sum = 0,bus = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (sum+arr[i]>m){
                bus++;
                sum=arr[i];
            }
            else {
                sum+=arr[i];
            }
        }
        if (sum>0){
            bus++;
            System.out.println(bus);
        }
    }
}
