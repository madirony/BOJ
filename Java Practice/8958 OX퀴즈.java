package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        String[] oxArr;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        oxArr = new String[num];
        for(int i=0;i<num;i++){
            oxArr[i] = scanner.next();
        }
        for(int x=0;x<num;x++){
            int score=0, plusScore=1;
            for(int y=0;y<oxArr[x].length();y++){
                if(oxArr[x].charAt(y)=='O'){
                    score += plusScore;
                    plusScore++;
                }
                else{
                    plusScore=1;
                }
            }
            System.out.println(score);
        }
    }
}
