package com.jspiders.collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Mainclass3 {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(33);
        set.add(null);
        set.add(20);
        set.add(40);

        for(Integer value : set) {
           if(value!=null && value % 2 == 0) {
               System.out.println(value);
           }
        }
        System.out.println("Program ends...");
    }
}
