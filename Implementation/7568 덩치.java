package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int people = Integer.parseInt(br.readLine());
        int[][] big = new int[people][2];
        for(int i = 0; i < people; i++){
            String[] split = br.readLine().split(" ");
            big[i][0] = Integer.parseInt(split[0]);
            big[i][1] = Integer.parseInt(split[1]);
        }
        int[] big_rank = new int[people];
        Arrays.fill(big_rank,1);
        for(int i = 0; i < people; i++){
            for(int j = 0; j < people; j++) {
                if(j!=i) {
                    if (big[i][0] < big[j][0] && big[i][1] < big[j][1]) {
                        big_rank[i]++;
                    }
                }
            }
        }
        for(int i = 0; i < people; i++){
            bw.write(String.valueOf(big_rank[i]+" "));
        }
        bw.flush();
        bw.close();
    }
}
