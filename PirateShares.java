package com.HackerRank_FacePrep;

import java.util.Scanner;

public class PirateShares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gold = in.nextInt();
        int BenSharePer = in.nextInt();
        int BBSharePer = in.nextInt();
        int BenShare = (gold*BenSharePer)/100;//473
        gold = gold - BenShare;
        int BBShare = (gold*BBSharePer)/100;//222
        gold = gold - BBShare;
        System.out.println(BenShare);
        System.out.println(BBShare);
        System.out.println(gold/3);

    }
}
