package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/**
 * Rajyalaxmi_Thumarada on 07-03-2023
 */
public class FIExamples {

    public static void main(String args[]) {

        Supplier<ArrayList<String>> suppList = () -> new ArrayList<>();
        System.out.println(suppList.get());

        Consumer<String> printer = s -> System.out.println(s);
        printer.accept(" Functional Interfaces in java");

        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> con = (i, s) -> map.put(i, s);
        con.accept(1, "item one");
        con.accept(2, "item two");
        System.out.println(map);

        Predicate<Integer> isPositive = x -> x>0 ;
        System.out.println("is positive 1" +isPositive.test(3));
        System.out.println("is positive 2" +isPositive.test(-5));

        Function<String , String> ex = s -> s.toUpperCase();
        System.out.println("function ex ::: " + ex.apply("hello"));

        UnaryOperator<Integer> square = x -> x*x ;
        System.out.println("unary operator example:::: " + square.apply(6));



    }

}
