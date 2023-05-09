import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Rajyalaxmi_Thumarada on 19-03-2023
 */
public class MajorityElement {

public static void main(String args []) {

    //int[] ints = {2,4,5,1,2,6,7,8,2};
    int[] ints = {1,1,2,1,3,5,1};

    int n = 7;
    System.out.println("in main of MajorityElement ::::" + findMajorityElement(ints,n));
    if(n == 7) {
        System.out.println(":::: n is 7");
    }
    if(n == 14/2) {
        System.out.println(":::::: n is again 7");
    }

}

    private static Integer findMajorityElement(int[] ints,int n) {

    int majoritySize = n/2 ;
        List<Integer> intList = Arrays.stream(ints).boxed().collect(Collectors.toList());
    Optional<Integer> res = Arrays.stream(ints).boxed().filter(x -> Collections.frequency(intList,x) > majoritySize).findAny();
     return  res.isPresent()?res.get(): res.orElse(-1);



    }



}
