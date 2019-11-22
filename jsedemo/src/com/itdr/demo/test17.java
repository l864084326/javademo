package com.itdr.demo;

public class test17 {
    public static void main(String[]A){
        int sum=0;
        int num=2;
        do{
            num=num+2;
            sum=sum+num;
        }while (num<=50);
        System.out.println(sum);
    }
}