package com.HackerRank_FacePrep;

import java.util.Scanner;

public class HotelTariff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int increasedRoomrent= (int) (b+(b*0.2));
        if (a==4 || a==5 || a==6 || a==11 || a==12){
            System.out.println(increasedRoomrent*c);
        } else if (a==1 || a==2 || a==3 || a==7 || a==8 || a==9 || a==10) {
            System.out.println(b*c);
        } else{
            System.out.println("Invalid Input");
        }
    }
}
