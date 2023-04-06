package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        int PassYear = in.nextInt();
        int FamIncome = in.nextInt();
        int Arrears = in.nextInt();
        int MarkPercent = in.nextInt();
        int AttenPercent = in.nextInt();

        if (PassYear >= 2021 && Arrears <= 2 && FamIncome <= 200000 && age >= 18 && age <= 21 && MarkPercent >= 60 && AttenPercent >= 80){
            System.out.println("Eligible");
        }
        else if (Arrears > 2){
            if (PassYear >= 2021 && FamIncome >= 200000 && FamIncome <= 250000  && age >= 18 && age <= 21 && MarkPercent >= 80 && AttenPercent >= 90){
                System.out.println("Partially Eligible");
            }
            else {
                System.out.println("Not Eligible");
            }
        }
        else {
            System.out.println("Not Eligible");
        }
    }
}
