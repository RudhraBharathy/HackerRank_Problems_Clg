package com.HackerRank_FacePrep;

import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalBalls = in.nextInt();
        int TotalRuns = in.nextInt();
        int RunsScored = in.nextInt();
        int BallsBowled = in.nextInt();

        int totalOver = totalBalls/6;
        double OverFinished = (BallsBowled/6)+(BallsBowled%6)*0.1;
        double CurrRR = RunsScored/OverFinished;
        double TotalRR = (float) TotalRuns/(totalBalls/6);
        System.out.println(totalOver);
        System.out.println(OverFinished);
        System.out.println(String.format("%.1f",CurrRR));
        System.out.println(String.format("%.1f",TotalRR));
        if (CurrRR > TotalRR){
            System.out.println("Eligible to Win");
        }
        else {
            System.out.println("Not Eligible to Win");
        }
    }
}
