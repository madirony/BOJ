package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int number, max=0;
        int[] rope;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        rope = new int[number];
        for(int i=0; i<number;i++){
            rope[i] = scanner.nextInt();
        }
        Arrays.sort(rope);

        for(int j=0;j<number;j++){
            if(max < rope[j]*(number-j)){
                max = rope[j]*(number-j);
            }
        }
        System.out.println(max);
    }
}
