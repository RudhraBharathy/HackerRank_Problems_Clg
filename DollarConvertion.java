package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class DollarConvertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dollar1 = in.nextInt();
        int cent1 = in.nextInt();
        int dollar2 = in.nextInt();
        int cent2 = in.nextInt();
        int initDolVal = dollar1+dollar2;
        int initCentVal = cent1+cent2;
        int getcentInDolVAl = (initCentVal/100);
        int getdolval = getcentInDolVAl*100;
        int gettotaldolVal = initCentVal-getdolval;
        System.out.println(getcentInDolVAl+initDolVal);
        System.out.println(gettotaldolVal);
    }
}
