package com.itdr.demo;

import java.util.Scanner;
public class test13 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int score=sr.nextInt();
        String sex="女";
        String six="男";
        if(score>80&&sex=="女"){
            System.out.println("进入女子组决赛");
        }else if(score>80&&sex=="男"){
            System.out.println("进入男子组决赛");
        }else if(score<=80)
            System.out.println("没有资格进去决赛");
    }
}
