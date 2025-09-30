package com.jspiders.collections;
import java.util.Comparator;
import java.util.TreeSet;

class DescOrder implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        int v1 = s2.compareTo(s1);
        return v1;
    }
}

public class Mainclass6 {

    public static void main(String[] args) {
        System.out.println("Program starts...");
       // TreeSet<String> ts1 = new TreeSet<String>();//compareTo
        DescOrder d1 = new DescOrder();
        TreeSet<String> ts1 = new TreeSet<>(d1);//compare
        ts1.add("B");
        ts1.add("B");
        ts1.add("D");
        ts1.add("A");
        ts1.add("E");
        ts1.add("C");

        for(String value : ts1) {
               System.out.println(value);
        }
        System.out.println("Program ends...");
    }
}
