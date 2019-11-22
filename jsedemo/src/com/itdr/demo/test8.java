package com.itdr.demo;

import java.util.Scanner;
public class test8 {
    public static void main(String[] args) {
        int a;
        Scanner sr= new Scanner(System.in);
        a=sr.nextInt();
        if(a>0&&a<10){
            System.out.println("这是一个一位数");
        }else if (a>9&&a<100){
            System.out.println("这是一个二位数");
        }else if(a>99&&a<1000){
            System.out.println("这是一个三位数");
        }
    }
}
