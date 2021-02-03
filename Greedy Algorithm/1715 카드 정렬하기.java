package com.company;

import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int card_bunddle = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0; i < card_bunddle; i++){
            pq.add(Long.parseLong(br.readLine()));
        }

        long count = 0;

        for (; 1 < pq.size(); ) {
            long tmp = pq.poll() + pq.poll();
            count += tmp;
            pq.add(tmp);
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
