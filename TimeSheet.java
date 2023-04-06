package com.HackerRank_Problems_Clg;

import java.util.Scanner;

public class TimeSheet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sun = in.nextInt();
        int mon = in.nextInt();
        int tue = in.nextInt();
        int wed = in.nextInt();
        int thus = in.nextInt();
        int fri = in.nextInt();
        int sat = in.nextInt();

        int monSal,tueSal,wedSal,thusSal,friSal;
        int sunSal = sun*150;
        int satSal = sat*125;
        if(mon<=8){
            monSal = mon*100;
        }
        else {
            int remainMonHrs= mon-8;
            monSal = (remainMonHrs*115)+800;
        }
        if(tue<=8){
            tueSal = tue*100;
        }
        else {
            int remainMonHrs= tue-8;
            tueSal = (remainMonHrs*115)+800;
        }
        if(wed<=8){
            wedSal = wed*100;
        }
        else {
            int remainMonHrs= wed-8;
            wedSal = (remainMonHrs*115)+800;
        }
        if(thus<=8){
            thusSal = thus*100;
        }
        else {
            int remainMonHrs= thus-8;
            thusSal = (remainMonHrs*115)+800;
        }
        if(fri<=8){
            friSal = fri*100;
        }
        else {
            int remainMonHrs= fri-8;
            friSal = (remainMonHrs*115)+800;
        }

        System.out.println(sunSal+monSal+tueSal+wedSal+thusSal+friSal+satSal);
    }
}
