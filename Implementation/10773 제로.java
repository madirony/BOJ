package com.company;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < count; i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                stack.pop();
            }
            else {
                stack.push(num);
            }
        }
        int sum = 0;
        while (stack.isEmpty()!=true){
            sum += stack.pop();
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
