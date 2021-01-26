package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt()%42;
        }
        Arrays.sort(arr);
        int num = arr[0] , count = 1;
        for(int i=1;i<arr.length;i++){
            if(num!=arr[i]) {
                num = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
