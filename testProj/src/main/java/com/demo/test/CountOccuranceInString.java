package com.demo.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Rajyalaxmi_Thumarada on 31-03-2023
 */
public class CountOccuranceInString {

    public static void main(String args[]) {

        String input = "ilovemyworkverymuch";
        // print the occurance of each character in the string
        Map<String,Long> mp =  Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("mp counting::::" + mp);
        //print the duplicate elements in the string
        System.out.println("duplicate elements ::");
        Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).keySet().stream().filter(x -> (mp.get(x) > 1)).forEach(a -> System.out.print(a + " "));
        System.out.println();
        //find unique elements
        System.out.println("unique elements ::");
        Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()==1).forEach(a -> System.out.print(a + " " ));

        System.out.println();
        //find first occurance of unique elements
        String firstUniqueElement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()==1)
                .findFirst().get().getKey();
        System.out.println("first non recurring element ::" + firstUniqueElement);

        //find first repeat  elements
        String firstRepeatElement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()>1)
                .findFirst().get().getKey();
        System.out.println("first recurring element ::" + firstRepeatElement);

        // Find second highest element
        int[] nums = {5,-9,11,2,8,-21,1};

        Optional<Integer> secondHighest = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("second highest element ::: " + (secondHighest.isPresent()?secondHighest.get():"Not applicable"));

        // Find second lowest element
         Optional<Integer> secondLowest = Arrays.stream(nums).boxed().sorted().skip(1).findFirst();
         System.out.println("second lowest element :::" + (secondLowest.isPresent()?secondLowest.get():"Not Applicable"));

         // find longest string in a given array
         String[] strings = {"java" , "techies" , "springboot" , "microservices"};
          String longestStr = Arrays.stream(strings).reduce((s1,s2) -> s1.length()>s2.length()?s1:s2).get();
          System.out.println("longest string:::" + longestStr);

          // find all elements starting with 1
         int[] ints = nums ;
         System.out.println("Nums starting with 1");
         Arrays.stream(ints).boxed().map(s -> s+"").filter(st -> st.startsWith("1")).forEach(a -> System.out.print(a + " " ));

         // String.join
        List<String> nos = Arrays.asList("1","2","3","4");
        // e.g 1-2-3-4
         System.out.println(String.join(",",nos));

         // skip and limit example
        IntStream.rangeClosed(1,10).boxed().skip(1).limit(8).forEach(x -> System.out.print(x + " "));




    }
}
