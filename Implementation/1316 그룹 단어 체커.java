package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num_of_words = Integer.parseInt(br.readLine());
        String[] word_array = new String[num_of_words];
        for(int i = 0; i < num_of_words; i++){
            word_array[i] = br.readLine();
        }

        int count = 0;
        for(int j = 0; j < word_array.length; j++){
            boolean[] alphabet = new boolean[26];
            char tmp = word_array[j].charAt(0);
            alphabet[(int)tmp-97] = true;
            if(1 < word_array[j].length()) {
                Loop:
                for (int k = 1; k < word_array[j].length(); k++) {
                    if (tmp != word_array[j].charAt(k)) {
                        tmp = word_array[j].charAt(k);
                        if (alphabet[(int) tmp - 97] == true) {
                            break Loop;
                        } else {
                            alphabet[(int) tmp - 97] = true;
                        }
                    }
                    if (k == word_array[j].length() - 1) {
                        count++;
                    }
                }
            }
            else{
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
