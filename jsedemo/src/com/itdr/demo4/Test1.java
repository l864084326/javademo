package com.itdr.demo4;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users[] uarr = new Users[100];
        Datas[] datas = new Datas[36];

        String uname = sc.next();
        int psd = sc.nextInt();
        String sx = sc.next();
        int month = sc.nextInt();
        String xz = sc.next();

        Datas d = new Datas("生肖","鸡","苏");
        datas[0] = d;
        Datas d2 = new Datas("生肖","马","顾");
        datas[1] = d2;
        Datas d3 = new Datas("生肖","羊","夏");
        datas[2] = d3;
        Datas d4 = new Datas("月份","1","小");
        datas[3] = d4;
        Datas d5 = new Datas("月份","2","棂");
        datas[4] = d5;
        Datas d6 = new Datas("月份","3","玥");
        datas[5] = d6;
        Datas d7 = new Datas("星座","白羊座","浅");
        datas[6] = d7;
        Datas d8 = new Datas("星座","金牛座","姬");
        datas[7] = d8;
        Datas d9 = new Datas("星座","巨蟹座","盈");
        datas[8] = d9;
        Datas d10 = new Datas("生肖","兔","陌");
        datas[9] = d10;
        Datas d11 = new Datas("生肖","龙","夜");
        datas[10] = d11;
        Datas d12 = new Datas("生肖","鼠","上官");
        datas[11] = d12;
        Datas d13 = new Datas("生肖","猪","慕");
        datas[12] = d13;
        Datas d14 = new Datas("生肖","猴","楚");
        datas[13] = d14;
        Datas d15 = new Datas("生肖","蛇","陆");
        datas[14] = d15;
        Datas d16 = new Datas("生肖","狗","程");
        datas[15] = d16;
        Datas d17 = new Datas("生肖","牛","浴");
        datas[16] = d17;
        Datas d18 = new Datas("生肖","虎","玉");
        datas[17] = d18;
        Datas d19 = new Datas("月份","4","浅");
        datas[18] = d19;
        Datas d20 = new Datas("月份","5","瑾");
        datas[19] = d20;
        Datas d21 = new Datas("月份","6","颜");
        datas[20] = d21;
        Datas d22 = new Datas("月份","7","曦");
        datas[21] = d22;
        Datas d23 = new Datas("月份","8","夭");
        datas[22] = d23;
        Datas d24 = new Datas("月份","9","眠");
        datas[23] = d24;
        Datas d25 = new Datas("月份","10","晴");
        datas[24] = d25;
        Datas d26 = new Datas("月份","11","莹");
        datas[25] = d26;
        Datas d27 = new Datas("月份","12","瑶");
        datas[26] = d27;
        Datas d28 = new Datas("星座","天蝎座","晞");
        datas[27] = d28;
        Datas d29 = new Datas("星座","摩羯座","蓉");
        datas[28] = d29;
        Datas d30 = new Datas("星座","双子座","儿");
        datas[29] = d30;
        Datas d31 = new Datas("星座","射手座","璃");
        datas[30] = d31;
        Datas d32 = new Datas("星座","狮子座","衣");
        datas[31] = d32;
        Datas d33 = new Datas("星座","处女座","仪");
        datas[32] = d33;
        Datas d34= new Datas("星座","天秤座","之");
        datas[33] = d34;
        Datas d35 = new Datas("星座","双鱼座","绯");
        datas[34] = d35;
        Datas d36 = new Datas("星座","水瓶座","色");
        datas[35] = d36;


        int x = register(uname, psd, sx, month, xz, uarr);
        if (x == 1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
        //用户登录
        System.out.println("请您登陆");
        String uname2 = sc.next();
        int psd2 = sc.nextInt();
        int login = login(uname2,psd2,uarr);
        if (login==1){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }


        System.out.println("请输入生肖、月份、星座");
        String sx2 = sc.next();
        String mon2 = sc.next();
        String xz2 = sc.next();
        String newName = startGame(sx2, mon2, xz2, datas);
        System.out.println("你前世的名字是："+newName);
    }


    public static int register(String uname, int psd, String sx, int month, String xz,Users[] a) {
        Users x = new Users();
        x.uname  = uname;
        x.psd = psd;
        x.sx = sx;
        x.month = month;
        x.xz = xz;

      for (int i= 0;i<a.length;i++){
          if (a[i] == null){
          a[i] = x;
          return 1;
          }
      }
      return -1;
    }
         public static int login(String uname,int psd,Users[] xa) {
        for (int i = 0; i < xa.length; i++) {
            if (xa[i] != null) {
                if (xa[i].uname.equals(uname) && xa[i].psd == psd) {
                    return 1;
                }
            }

        }
        return -1;
    }
    public static String startGame(String sx,String mon,String xz,Datas[] ds){
        String newName = "";

        for(int i =0;i<ds.length;i++){
            if(ds[i] != null){
                //生肖
                if(ds[i].category.equals("生肖")){
                    if(ds[i].yz.equals(sx)){
                        newName = newName+ds[i].xz;
                    }
                }
                //月份
                if(ds[i].category.equals("月份")){
                    if(ds[i].yz.equals(mon)){
                        newName = newName+ds[i].xz;
                    }
                }
                //星座
                if(ds[i].category.equals("星座")){
                    if(ds[i].yz.equals(xz)){
                        newName = newName+ds[i].xz;
                    }
                }
            }
        }

        return newName;
    }

}





