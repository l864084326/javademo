package com.itdr.demo;
import java.util.Scanner;
public class Test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        xxx(a);
    }
      public static int xxx(int c) {
          if (c % 2 == 0) {
              System.out.println("这是一个偶数");

          } else {
              System.out.println("这是一个奇数");
          }return 1;
      }
}
