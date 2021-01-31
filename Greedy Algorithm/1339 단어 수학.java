package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberofwords = Integer.parseInt(br.readLine());
        String[] wordlist = new String[numberofwords];
        int[] scorelist = new int[26];
        for(int i=0; i<numberofwords; i++){
            wordlist[i] = br.readLine();
            int wordlength = wordlist[i].length()-1;
            for(int j=0; j<wordlist[i].length(); j++){
                int digit = (int)Math.pow(10,wordlength);
                scorelist[(int)wordlist[i].charAt(j)-65] += digit;
                wordlength--;
            }
        }
        Arrays.sort(scorelist);

        int sum = 0, score = 9;
        for(int i = 25; scorelist[i]!=0; i--){
            sum += scorelist[i] * score;
            score--;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
