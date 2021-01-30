package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String numerical;
        int result=0;
        Scanner scanner = new Scanner(System.in);
        numerical = scanner.nextLine();
        String[] arr = numerical.split("-");
        if(arr[0].isEmpty()==true){
            for(int i=1;i<arr.length;i++){
                String[] num = arr[i].split("\\+");
                for(int j=0;j<num.length;j++){
                    result -= Integer.parseInt(num[j]);
                }
            }
        }
        else{
            String[] tmp = arr[0].split("\\+");
            for(int i=0;i<tmp.length;i++){
                result += Integer.parseInt(tmp[i]);
            }
            for(int j=1;j<arr.length;j++){
                String[] num = arr[j].split("\\+");
                for(int k=0;k<num.length;k++){
                    result -= Integer.parseInt(num[k]);
                }
            }
        }
        System.out.println(result);
    }
}
