package com.HackerRank_FacePrep;

import java.util.Scanner;

public class BetterShoppingCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int FCPrice = in.nextInt();
        int FCDis = in.nextInt();
        int FCShip = in.nextInt();
        int SNAPPrice = in.nextInt();
        int SNAPDis = in.nextInt();
        int SNAPShip = in.nextInt();
        int AMAPrice = in.nextInt();
        int AMADis = in.nextInt();
        int AMAShip = in.nextInt();

        int Flipcart = (FCPrice-(FCPrice*FCDis/100)+FCShip);
        int Snapdeal = (SNAPPrice-(SNAPPrice*SNAPDis/100)+SNAPShip);
        int Amazon = (AMAPrice-(AMAPrice*AMADis/100)+AMAShip);

        System.out.println("In Flipkart: Rs."+Flipcart);//220
        System.out.println("In Snapdeal: Rs."+Snapdeal);//220
        System.out.println("In Amazon: Rs."+Amazon);//400


        if (Flipcart < Snapdeal && Flipcart < Amazon) {
            System.out.println("Choose Flipkart");
        }else if (Flipcart==Amazon || Flipcart==Snapdeal){
            System.out.println("Choose Flipkart");
        }
        else if (Flipcart < Amazon) {
            System.out.println("Choose Snapdeal");
        }
        else if (Snapdeal==Amazon){
            System.out.println("Choose Snapdeal");
        }
        else {
            System.out.println("Choose Amazon");
        }


    }
}
