package com.itdr.demo;

import java.util.Scanner;
public class test12 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int age=sr.nextInt();
        if(age>=18) {
            System.out.println("成年");
        }else if(age<18){
            System.out.println("未成年");
        }

    }
}