package com.atguigu.spzx.manager.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            String result = "";
            for(int i = arr.length-1;i>=0;i--){
                result+=arr[i]+" ";
            }
            System.out.println(result.trim());
        }
    }
}
