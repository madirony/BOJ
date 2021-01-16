package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int people, sum=0;
        Scanner scanner = new Scanner(System.in);
        people = scanner.nextInt();
        int[] time = new int[people];
        for(int i=0;i<people;i++){
            time[i] = scanner.nextInt();
        }

        for(int x=0; x<people-1;x++){
            for(int y=x+1; y<people;y++){
                if(time[x]>time[y]){
                    int tmp = time[x];
                    time[x]=time[y];
                    time[y]=tmp;
                }
            }
        }

        for(int j=0;j<people;j++){
            sum += time[j]*(people-j);
        }
        System.out.println(sum);
    }
}
