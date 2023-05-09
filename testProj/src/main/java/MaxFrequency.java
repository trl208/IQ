import java.util.Arrays;

/**
 * Rajyalaxmi_Thumarada on 19-03-2023
 */
public class MaxFrequency {

    public static void main(String args []) {

        //int[] ints = {2,4,5,1,2,6,7,8,2};
     //   List<Integer> ints = Arrays.asList(1,1,2,1,3,5,1);
        int[] ints = {1,1,2,1,3,5,1,3,3,3,3};
        System.out.println("in main of MaxFrequency ::::" + findMaxFrequency(ints));

    }

    private static Integer findMaxFrequency(int[] ints) {
        Arrays.sort(ints);
        int maxCount = 1, currCount = 1, res = ints[0];

        for(int i=1; i< ints.length; i++) {
            if(ints[i] == ints[i-1]) {
                currCount++;
            } else {
                currCount = 1;
            }

            if(currCount > maxCount){
                maxCount = currCount;
                res = ints[i];
            }

        }

       // List<Integer> intList = Arrays.stream(ints).boxed().collect(Collectors.toList());
      //  Integer res =  ints.stream().map(x -> Collections.frequency(ints,x)).max(Integer::compare).get();
        return  res;

    }



}
