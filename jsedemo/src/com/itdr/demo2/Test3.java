package com.itdr.demo2;

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行：");
        int h = sc.nextInt();
        System.out.println("请输入列：");
        int l = sc.nextInt();
          outPxsbx(h,l);}
//         打印平行四边形
    public static void outPxsbx(int c,int k){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("*");
                }
                System.out.println();
            }
        }
    }
