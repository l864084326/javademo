package com.itdr.demo4;

public class Datas {
    String category;
    String yz;
    String xz;

    public Datas() {
    }

    public Datas(String c, String y, String x) {
        this.category = c;
        this.yz = y;
        this.xz = x;
    }
    public static void main(String[] args) {
        Datas d = new Datas("生肖", "鸡", "苏");
        Datas d2 = new Datas("生肖", "鸡", "苏");

        System.out.println(d.yz);
        System.out.println(d.xz);
    }
}
