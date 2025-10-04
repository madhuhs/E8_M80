package com.jspiders.collections;

import java.util.ArrayList;

public class Mainclass10 {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        ArrayList<String> a1 = new ArrayList<String>();
        //a1.add(10); //a1[0] = 10;
        a1.add("hello");

        String s1 = a1.get(1);

        System.out.println("Program ends...");
    }
}
