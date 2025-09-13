package com.jspiders.java8;

interface Run3 {
    public default void test() {
        System.out.println("this test() of Run3 interface");
    }
}
interface Run4 {
    public default void test() {
        System.out.println("this test() of Run4 interface");
    }
}
class Sample2 implements Run3, Run4
{
    @Override
    public void test() {
        System.out.println("this test() of Sample2 interface");
        Run3.super.test();
        Run4.super.test();
    }
}
public class Mainclass1 {
    public static void main(String[] args) {
        Sample2 s = new Sample2();
        s.test();
    }
}
