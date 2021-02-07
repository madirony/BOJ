package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] room_num = br.readLine().split("");
        int[] room_int = new int[9];
        for(int i = 0; i < room_num.length; i++){
            if(Integer.parseInt(room_num[i])==9){
                room_int[6]++;
            }
            else{
                room_int[Integer.parseInt(room_num[i])]++;
            }
        }

        int count = 0;
        while(true){
            for(int j = 0; j < 9; j++){
                if(j==6){
                    room_int[j] -= 2;
                }
                else{
                    room_int[j]--;
                }
            }
            count++;
            boolean check = false;
            for(int k = 0; k < 9; k++){
                if(room_int[k]>0){
                    check = true;
                }
            }
            if(check==false){
                break;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
