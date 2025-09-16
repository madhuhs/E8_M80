package com.jspiders.strings;

public class Mainclass1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");

        int h1 = sb1.hashCode();
        int h2 = sb2.hashCode();
        System.out.println("h1 : "+h1);
        System.out.println("h2 : "+h2);

        String str1 = sb1.toString();
        String str2 = sb2.toString();
        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2);

        boolean res = sb1.equals(sb2);
        System.out.println("res : "+res);

        sb1 = sb1.append("hello");
    }
}
