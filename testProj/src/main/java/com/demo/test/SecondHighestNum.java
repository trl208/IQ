package com.demo.test;

import java.util.Arrays;
import java.util.Optional;

/**
 * Rajyalaxmi_Thumarada on 31-03-2023
 */
public class SecondHighestNum {

    public static void main(String args []) {

        int[] nums = {5,9,11,2,8,21,1};
        Optional<Integer> secondHighest = Arrays.stream(nums).boxed().sorted(((o1, o2) -> o2.compareTo(o1))).skip(1).findFirst();
        System.out.println("second highest element ::: " + (secondHighest.isPresent()?secondHighest.get():"Not applicable"));

    }


}
