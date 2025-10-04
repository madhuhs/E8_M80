package com.jspiders.threads;

public class Mainclass2 {

    public static void main(String[] args) {
        System.out.println("MAIN starts...");

        Runnable r1 =  () ->{
            System.out.println("Task-1 starts..");
            for(int j=4;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println("Task-1 ends..");
        };

        Runnable r2 =  ()->{
            System.out.println("Task-2 starts..");
            for(int j=1;j<=4;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("Task-2 ends..");
        };

        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();

        System.out.println("MAIN ends...");
    }
}
