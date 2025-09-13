package com.jspiders.java8;

interface Run1
{
    public void test();
    public static void count(){
        System.out.println("this is static-count() of Run1 interface");
    }
    public default void view(){
        System.out.println("this is default-view() of Run1 interface");
    }
}
class Demo implements Run1{
    @Override
    public void test() {
        System.out.println("Overriding test() in Demo class");
    }
}
class Sample1 implements Run1{
    @Override
    public void test() {
        System.out.println("Overriding test() in Sample class");
    }
}
public class Mainclass {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        Run1.count();
        Demo d1 = new Demo();
        d1.view();
        Sample1 s1 = new Sample1();
        s1.view();
        System.out.println("Program ends...");
    }
}
