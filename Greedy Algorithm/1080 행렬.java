package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] matrix_size = br.readLine().split(" ");
        int row = Integer.parseInt(matrix_size[0]), column = Integer.parseInt(matrix_size[1]);
        boolean[][] first_matrix = new boolean[row][column];
        boolean[][] second_matrix = new boolean[row][column];
        for(int i=0; i<row; i++){
            String tmp = br.readLine();
            String[] element = tmp.split("");
            for(int j=0; j<column; j++){
                if(Integer.parseInt(element[j])==1){
                    first_matrix[i][j] = true;
                }
                else{
                    first_matrix[i][j] = false;
                }
            }
        }
        for(int i=0; i<row; i++){
            String tmp = br.readLine();
            String[] element = tmp.split("");
            for(int j=0; j<column; j++){
                if(Integer.parseInt(element[j])==1){
                    second_matrix[i][j] = true;
                }
                else{
                    second_matrix[i][j] = false;
                }
            }
        }


        int count=0;
        for(int i=0; i+2<row; i++){
            for(int j=0; j+2<column; j++){
                if(first_matrix[i][j] != second_matrix[i][j]) {
                    for (int k = 0; k < 3; k++) {
                        for(int l=0; l<3; l++) {
                            first_matrix[i + k][j + l] = !first_matrix[i + k][j + l];
                        }
                    }
                    count++;
                }
            }
        }
        Loop : for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(first_matrix[i][j]!=second_matrix[i][j]){
                    bw.write(String.valueOf(-1));
                    break Loop;
                }
            }
            if(i==row-1){
                bw.write(String.valueOf(count));
            }
        }

        bw.flush();
        bw.close();
    }
}
