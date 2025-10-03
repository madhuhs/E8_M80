package com.jspiders.collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.PriorityQueue;

public class Mainclass9 {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        Hashtable<Integer,String> ht1 = new Hashtable<Integer,String>();
        ht1.put(1,"A");
        ht1.put(2,"B");
        ht1.put(3,"C");
        ht1.put(4,"D");
        ht1.put(5,"E");
        System.out.print("HASHTABLE -> ");
        System.out.println(ht1);

        System.out.println("------------------");

        HashMap<Integer,String> hm1 = new HashMap<>();
        hm1.put(1,"A");
        hm1.put(2,null);
        hm1.put(3,"C");
        hm1.put(4,"D");
        hm1.put(5,"E");
        hm1.put(4,"F");
        hm1.put(6,"A");
        hm1.put(null,"X");

        System.out.print("HASHMAP -> ");
        System.out.println(hm1);


        System.out.println("Program ends...");
    }
}
