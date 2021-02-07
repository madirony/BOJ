package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testcase; i++){
            int num_of_doc, index;
            Queue<Integer> queue = new LinkedList<>();
            String[] info = br.readLine().split(" ");
            num_of_doc = Integer.parseInt(info[0]);
            index = Integer.parseInt(info[1]);
            String[] impo = br.readLine().split(" ");
            int max = 0;
            for(int j = 0; j < num_of_doc; j++){
                int num = Integer.parseInt(impo[j]);
                queue.add(num);
                if(max<num) {
                    max = num;
                }
            }
            int count = 0, queueindex = 0;
            boolean[] array = new boolean[num_of_doc];
            Arrays.fill(array,false);
            while(queue.isEmpty()!=true){
                if(queue.peek()==max) {
                    //System.out.println(queue.peek());
                    //System.out.println("\n"+queueindex+"qb "+ index + ": index"+"\n");
                    array[queueindex] = true;
                    queue.remove();
                    count++;
                    if (queue.isEmpty() == true) {
                        break;
                    }
                    else if(array[index]==true){
                        break;
                    }
                    else {
                        max = 0;
                        for (int k = 0; k < queue.size(); k++) {
                            if (max < queue.peek()) {
                                max = queue.peek();
                            }
                            int tmp = queue.poll();
                            queue.add(tmp);
                        }

                    }
                }
                else {
                    int tmp = queue.poll();
                    queue.add(tmp);
                }

                queueindex++;
                queueindex = queueindex % num_of_doc;

                while(true) {
                    if(array[queueindex]==true) {
                        queueindex++;
                        queueindex = queueindex % num_of_doc;
                    }
                    else{
                        break;
                    }
                }
            }
            bw.write(String.valueOf(count+"\n"));
        }
        bw.flush();
        bw.close();
    }
}
