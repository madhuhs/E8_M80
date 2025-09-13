package com.jspiders.p1;

public class Demo {

    public    int    v1 = 10;
    protected double v2 = 2.5;
              long   v3 = 4525154504755l;
    private   String v4 = "hello";

    public void test1(){
        System.out.println("this is public-test1()");
    }

    protected void test2(){
        System.out.println("this is protected-test2()");
    }

    void test3(){
        System.out.println("this is pkg-level-test3()");
    }

    private void test4(){
        System.out.println("this is private-test4()");
    }
}
