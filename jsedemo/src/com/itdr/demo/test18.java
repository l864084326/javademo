package com.itdr.demo;

public class test18 {
    public static void main(String[] aegs){
        int sum=0;
        for (int i=1;i<=101;i++){
            if (i%3 !=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}