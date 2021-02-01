package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] number = new int[count];
        for(int i = 0; i<count; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(number);
        int sum = 0;
        for(int j = count-1; 0<=j; j--) {
            try {
                if (number[j] > 0 && number[j - 1] >= 0) {
                    if(number[j-1]!=0) {
                        if (number[j] * number[j - 1] < number[j] + number[j - 1]) {
                            sum += number[j] + number[j - 1];
                        } else {
                            sum += number[j] * number[j - 1];
                        }
                        j--;
                    }
                    else{
                        sum += number[j];
                    }
                } else if (number[j] >= 0 && number[j - 1] < 0) {
                    if(number[j]!=0) {
                        sum += number[j];
                    } else{
                        if(j-1==0){
                            sum += number[j] * number[j-1];
                            j--;
                        }
                        else{
                            if((j-1)%2==0){
                                sum += number[j] * number[j-1];
                                j--;
                            }
                            else{
                            }
                        }
                    }
                } else if (number[j] < 0 && number[j - 1] < 0) {
                    if (j % 2 == 0) {
                        sum += number[j];
                    } else {
                        sum += number[j] * number[j - 1];
                        j--;
                    }
                }
            }catch (Exception e){
                sum += number[j];
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
