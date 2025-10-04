package com.jspiders.threads;

class Demo extends Thread
{
    @Override
    public void run()
    {
        System.out.println("COUNT()-Demo starts...");
        for(int j=1;j<=5;j++) {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("COUNT()-Demo starts...");
    }

}

class Sample extends Object implements Runnable
{
    @Override
    public void run() {
        System.out.println("COUNT()-Sample starts...");
        for(int j=4;j>=1;j--)
        {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("COUNT()-Sample ends...");
    }
}
public class Mainclass {
    public static void main(String[] args) {
        System.out.println("MAIN starts...");
        Demo d1 = new Demo();
        d1.start();
        Sample s1 = new Sample();
        Thread t1 = new Thread(s1);
        t1.start();
        System.out.println("MAIN ends...");
    }
}
