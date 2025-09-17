package com.jspiders.wrapper;

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        int v1 = 10;
        int v2 = 20;
        int large = Integer.max(v1, v2);
        int small = Integer.min(v1, v2);

        System.out.println("large : "+large);
        System.out.println("small : "+small);

        String s1 = "30";
        String s2 = "60";
        System.out.println(s1 + s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println(i1 + i2);

        System.out.println("Program ends...");
    }
}
