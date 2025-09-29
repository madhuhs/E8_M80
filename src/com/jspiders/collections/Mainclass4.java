package com.jspiders.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Mainclass4 {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(null);
        set.add(40);
        set.add(50);
        set.add(20);

        for(Integer value : set) {
               System.out.println(value);
        }
        System.out.println("Program ends...");
    }
}
