package com.jspiders.collections;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class Mainclass8 {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        pq1.add(20);
        pq1.add(20);
        pq1.add(10);
        pq1.add(40);
        pq1.add(30);
        pq1.add(50);

        while(pq1.isEmpty()==false){
            System.out.println(pq1.poll());
        }
        System.out.println("Program ends...");
    }
}
