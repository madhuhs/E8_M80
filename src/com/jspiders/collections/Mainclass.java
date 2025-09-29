package com.jspiders.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Mainclass {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        LinkedList a1 = new LinkedList();
        a1.add(10); //a1[0] = 10;
        a1.add(20);
        a1.add(null);
        a1.add(30);
        a1.add(30);
        a1.add(40);
        a1.add(null);
        a1.add(50);

        System.out.println("a1 contains " + a1.size());

        System.out.println(a1.get(0));

        int ub = a1.size();

        for (int i = 0; i < ub; i++) {
            System.out.println(a1.get(i));
        }

        System.out.println("Program ends...");
    }
}
