package com.demo.test;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Rajyalaxmi_Thumarada on 07-03-2023
 */
public class MethodReferencesEx {

    public static void main(String args []) {
        // sort the given array of strings in a case insensitive manner
        String[] strs = {"addasap", "AFdfvre" , "aDverse", "APPLE"};
        //Arrays.sort(strs, (x,y) -> x.compareToIgnoreCase(y));
        Arrays.sort(strs,String::compareToIgnoreCase);
        System.out.println("sorted array::::" );
        Arrays.stream(strs).forEach(x -> System.out.println(x));

        Function<String,Integer> toInteger = MethodReferencesEx::parse;
        System.out.println("toInteger::::" +toInteger.apply("3"));


    }

    private static Integer parse(String s) {

        return Integer.parseInt(s);

    }

}
