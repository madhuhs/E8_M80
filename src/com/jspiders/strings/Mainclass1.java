package com.jspiders.strings;

public class Mainclass1 {
    public static void main(String[] args) {
        //Using new keyword
        String s1 = new String("hello");
        //Without using new keyword
        String s2 = "hello";

        int h1 = s1.hashCode();
        System.out.println("h1 : "+h1);
        int h2 = s2.hashCode();
        System.out.println("h2 : "+h2);

        String str1 = s1.toString();
        System.out.println(str1);

        boolean res = s1.equals(s2);
        System.out.println(res);

        boolean res2 = s1 == s2;
        System.out.println(res2);

    }
}
