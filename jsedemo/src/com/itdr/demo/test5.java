package com.itdr.demo;

public class test5 {
    public static void main(String[] args){
        int age1=24;
        int age2=18;
        int age3=36;
        int age4=27;
        int sum=age1+age2+age3+age4;
        int avg=(age1+age2+age3+age4)%4;
        int minu=age1-age2;
        int d=age1--;
        System.out.println("年龄总和"+sum);
        System.out.println("平均年龄"+avg);
        System.out.println("年龄差值"+minu);
        System.out.println("自减后的年龄"+d);

    }
}
