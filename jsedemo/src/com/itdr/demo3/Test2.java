package com.itdr.demo3;
import java.util.Scanner;
public class Test2 {
    public static void main( String[] args){
        Scanner sc= new Scanner(System.in);

       Food f1 = new Food();
        Food f2 = new Food();
        Food f3 = new Food();
        //定义商品的属性
        f1.food = "鸡蛋炒饭";
        f1.money = 10;
        f1.material = "鸡蛋，米饭";
        f2.food= "鸡蛋拉面";
        f2.money= 7;
        f2.material = "鸡蛋，白面";
        f3.food = "鸡蛋大饼";
        f3.money = 5;
        f3.material = "鸡蛋，大饼";


        Food[] arr = new Food[100];
        arr[0] = f1;
        arr[1] = f2;
        arr[2] = f3;


        System.out.println("欢迎来到餐厅");

        System.out.println("请选购以下商品");
        for(int i= 0;i < arr.length;i++){
            if (arr[i] != null){
                System.out.println("商品号:"+i+"   商品名称:"+arr[i].food+"   商品价格:"+arr[i].money+"   商品材料:"+arr[i].material);
            }
        }
        System.out.println("请选择需要商品");
        int x = sc.nextInt();
        if(x<arr.length && x>=0){
            System.out.println("商品号:"+x+"   商品名称:"+arr[x].food+"   商品价格:"+arr[x].money+"   商品材料:"+arr[x].material);
        }else{
            System.out.println("您输入的商品"+x+"不存在");
        }
    }
}