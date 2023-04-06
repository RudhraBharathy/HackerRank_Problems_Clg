package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();//234 = 3
        String inputTOSTR = String.valueOf(input);
        String finalVal = "";
        for (int i=inputTOSTR.length()-1;i>=0;i--){
            finalVal += inputTOSTR.charAt(i);
        }
        System.out.println(finalVal);
    }
}
