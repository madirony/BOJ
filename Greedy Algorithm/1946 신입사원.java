package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int testcase = Integer.parseInt(str);
        for(int i=0; i<testcase;i++) {
            int people = Integer.parseInt(br.readLine());
            int pass=0;
            int[][] scorerank = new int[people][2];
            for (int j = 0; j < people; j++) {
                String[] splitscore = br.readLine().split(" ");
                scorerank[j][0] = Integer.parseInt(splitscore[0]);
                scorerank[j][1] = Integer.parseInt(splitscore[1]);
            }
            Arrays.sort(scorerank, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            pass++;
            int intmin = scorerank[0][1];
            for (int k = 1; k < scorerank.length; k++) {
                if(scorerank[k][1]<intmin){
                    intmin = scorerank[k][1];
                    pass++;
                }
            }
            System.out.println(pass);
        }
    }
}
