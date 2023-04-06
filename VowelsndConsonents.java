package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class VowelsndConsonents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char x = in.next().charAt(0);
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U' ){
            System.out.println("Vowel");
        }
        else if (x>='a' && x<='z' || x>='A' && x<='Z') {
            System.out.println("Consonant");
        } else{
            System.out.println("Not an alphabet");
        }
    }
}
