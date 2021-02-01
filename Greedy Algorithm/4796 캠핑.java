package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        while(true){
            String testcase = br.readLine();
            if(testcase.equals("0 0 0")){
                break;
            }
            String[] num_of_testcase = testcase.split(" ");
            int L = Integer.parseInt(num_of_testcase[0]), P = Integer.parseInt(num_of_testcase[1]), V = Integer.parseInt(num_of_testcase[2]);
            int result = V/P*L;
            if(V%P < L) {
                result += V%P;
            }
            else if(L <= V%P){
                result += L;
            }
            count++;
            bw.write("Case "+count+": "+result+"\n");
        }

        bw.flush();
        bw.close();
    }
}
