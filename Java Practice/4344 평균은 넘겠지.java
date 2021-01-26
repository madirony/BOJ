package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int testNum;
        Scanner scanner = new Scanner(System.in);
        testNum = scanner.nextInt();
        for(int i=0;i<testNum;i++){
            int studentNum = scanner.nextInt();
            int[] score = new int[studentNum];
            int avg=0;
            for(int j=0;j<studentNum;j++){
                score[j] = scanner.nextInt();
                avg+=score[j];
            }
            avg/=studentNum;
            float goodScore=0;
            for(int k=0;k<studentNum;k++){
                if(score[k]>avg){
                    goodScore+=1;
                }
            }
            System.out.printf("%.3f%%%n",goodScore/studentNum*100);
        }
    }
}
