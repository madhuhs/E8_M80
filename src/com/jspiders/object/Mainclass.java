package com.jspiders.object;

public class Mainclass {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;

        int h1 = obj1.hashCode();
        int h2 = obj2.hashCode();
        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);

        String s1 = obj1.toString();
        System.out.println("s1 : "+s1);
        String s2 = obj2.toString();
        System.out.println("s2 : "+s2);

        boolean b1 = obj1.equals(obj2);
        System.out.println("b1 : "+b1);

        boolean b2 = obj1.equals(obj3);
        System.out.println("b2 : "+b2);

        boolean b3 = obj1 == obj2;
        System.out.println("b3 : "+b3);

        System.out.println("Program ends...");
    }
}
