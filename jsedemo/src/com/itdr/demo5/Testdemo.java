package com.itdr.demo5;
import java.util.Scanner;
public class Testdemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person[] person = new Person[100];
        Pet[] pet = new Pet[5];
        //灵境之人资料
        System.out.println("请输入你的名字");
        String name = sc.next();
        System.out.println("请输入你的门派");
        String group = sc.next();
        System.out.println("请输入你的性别");
        String sex = sc.next();
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        Pet a = new Pet();
        pet[0] = a;
        a.pname = "金";
        a.shuxing = "就金属性呗";
        a.nengli = 10;
        a.dengji = "S";
        a.jineng = "生金";
        Pet b = new Pet();
        pet[1] = b;
        b.pname = "木";
        b.shuxing = "就木属性呗";
        b.nengli = 8;
        b.dengji = "A";
        b.jineng = "生木";
        Pet c = new Pet();
        pet[2] = c;
        c.pname = "水";
        c.shuxing = "就水属性呗";
        c.nengli = 6;
        c.dengji = "B";
        c.jineng = "生水";
        Pet d = new Pet();
        pet[3] = d;
        d.pname = "火";
        d.shuxing = "就火属性呗";
        d.nengli = 4;
        d.dengji = "C";
        d.jineng = "生火";
        Pet e = new Pet();
        pet[4] = e;
        e.pname = "土";
        e.shuxing = "就土属性呗";
        e.nengli = 3;
        e.dengji = "D";
        e.jineng = "生土";


//        int first = first(name, group, sex, age, person);
        if (age >= 10 && age < 30) {
            System.out.println("进入条件符合，欢迎来到试炼之地-灵境");
        } else {
            System.out.println("进入年龄不符，进入失败");
            return;
        }


            System.out.println("请根据介绍选择想要的灵兽(序号)");
            for (int i = 0; i < pet.length; i++) {
                if (pet[i] != null) {
                    System.out.println("灵兽序号" + i + "  属性" + pet[i].shuxing + "  能力值" + pet[i].nengli + "  等级" + pet[i].dengji + "   技能" + pet[i].jineng);
                }
            }
            int x = sc.nextInt();
            if (x < pet.length && x >= 0) {
                System.out.println("灵兽序号" + x + "  属性" + pet[x].shuxing + "  能力值" + pet[x].nengli + "  等级" + pet[x].dengji + "  技能" + pet[x].jineng);
            } else {
                System.out.println("你的输入有误");
                return;
            }
            System.out.println("请回答问题，问题回答正确获得灵兽");
            System.out.println("灵兽：廊坊第一帅，齐齐哈尔第一帅（答案与答案间用逗号隔开）");

            String y = sc.next();
            if (y.equals("大头，治治")) {
                System.out.println("你的回答正确，成功");
            } else {
                System.out.println("你的回答错误，失败  请重新选择灵兽");
            }
        }
    }



//    public static int first(String name, String group, String sex, int age, Person[] x) {
//        Person a = new Person();
//        a.name = name;
//        a.group = group;
//        a.sex = sex;
//        a.age = age;


//        for (int i = 0; i < x.length; i++) {
//            if (age >= 10 && age < 30) {
//
//                return 1;
//            } else if (x[i] != null) {
//                x[i] = a;
//            }
//        }
//        return 1;
//    }
//}








