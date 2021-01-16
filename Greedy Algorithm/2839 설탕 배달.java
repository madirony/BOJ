package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num, count, share, rem;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        share = num/5;
        rem = num%5;
        if(rem==0) {
            System.out.printf("%d",num/5);
        }

        else{
            while(true){
                if(rem%3==0){
                    count = share+rem/3;
                    System.out.printf("%d",count);
                    break;
                }

                if(share==0 && rem/3!=0){
                    System.out.println(-1);
                    break;
                }
                share -= 1;
                rem = num-share*5;
            }

        }
    }
}
