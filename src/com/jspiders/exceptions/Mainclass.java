package com.jspiders.exceptions;

import java.util.Scanner;

public class Mainclass {

    public static void test(int num1,int num2){
        int res = num1 / num2;
        System.out.println("res : "+res);
    }

    public static void main(String[] args) {
        System.out.println("Program starts...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input 1");
        int num1 = sc.nextInt();
        System.out.println("Enter input 2");
        int num2 = sc.nextInt();
        test(num1,num2);
        System.out.println("Program ends...");
    }
}
