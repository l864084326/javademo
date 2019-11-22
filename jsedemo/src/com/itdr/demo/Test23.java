package com.itdr.demo;
import java.util.Scanner;
public class Test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
//        int[] arr2= new int[100];
        System.out.println("请输入用户名");
        int a = sc.nextInt();
//        System.out.println("请输入密码");
//        int b = sc.nextInt();

        fff(a,arr);
       int f = 1;
        if (f== 1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }

    }   public static int fff( int zss,int arr[]){
        if (zss>0){
        }else {
            return -1;
        }

                for ( int c= 0;c<arr.length;c++){
                    if (zss==arr[c]){
                        return -1;
                    }else{
                        arr[c]=zss;
                        return 1;
                    }
                }return 1;
    }

}
