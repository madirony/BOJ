package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, max;
        float newAvg=0;
        int[] avg;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        avg = new int[num];
        for(int i=0;i<avg.length;i++){
            avg[i]=scanner.nextInt();
        }
        Arrays.sort(avg);
        max = avg[avg.length-1];
        for(int i=0;i<avg.length;i++){
            newAvg += avg[i];
        }
        newAvg = newAvg/max*100/num;
        System.out.println(newAvg);
    }
}
