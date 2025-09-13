package com.jspiders.functional;
import java.util.function.*;

public class Mainclass1 {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        Consumer<String> c1 = (String str)->{
            System.out.println(str);
        };
        c1.accept("hello");

        Supplier<String> s1 = ()->{
            return "hello";
        };
        s1.get();

        BiFunction<Integer, Integer, Integer> b1 =
                (x, y) -> {return x + y;};

       int res = b1.apply(1, 2);
        System.out.println(res);

        System.out.println("Program ends...");
    }
}
