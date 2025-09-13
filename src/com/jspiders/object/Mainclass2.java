package com.jspiders.object;

class Demo extends Object {
    @Override
    public int hashCode(){
       int v1 = 100 + 50;
       return v1;
    }

    @Override
    public String toString(){
        String s1 = "hello";
        return s1;
    }

    @Override
    public boolean equals(Object o){
        return true;
    }
}


public class Mainclass2 {

    public static void main(String[] args) {
        System.out.println("Program starts...");

        Demo d1 = new Demo();
        int h1 = d1.hashCode();
        System.out.println("h1 : "+h1);

        String s1 = d1.toString();
        System.out.println("s1 : "+s1);

        System.out.println(d1.toString());
        System.out.println(d1);

        System.out.println("Program ends...");
    }
}









