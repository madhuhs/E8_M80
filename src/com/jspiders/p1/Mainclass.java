package com.jspiders.p1;

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        Demo d1 = new Demo();

        System.out.println("d1.v1 : "+d1.v1);
        d1.test1();
        d1.v1 = 500;

        System.out.println("d1.v2 : "+d1.v2);
        d1.test2();

        System.out.println("d1.v3 : "+d1.v3);
        d1.test3();

        System.out.println("Program ends...");
    }
}
