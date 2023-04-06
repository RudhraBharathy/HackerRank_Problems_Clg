package com.HackerRank_FacePrep;

import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int tree = in.nextInt();

        if (tree < col || tree%col==0 || tree%col==1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
