import java.util.Arrays;

/**
 * Rajyalaxmi_Thumarada on 20-03-2023
 */
public class SecondLargestElement {

    public static void main(String args []) {
        //int[] ints = {4,4,5,3,8,2,2,6,5};
        int[] ints = {12,35,1,10,34,1};
        getSecondLargestElement(ints);
    }

    private static void getSecondLargestElement(int[] ints) {

        Arrays.sort(ints);
        if(ints.length < 2) {
            System.out.println("there is no second largest element");
            return;
        }
        for(int i = ints.length -2; i >=0; i--) {

            if(ints[i] != ints[ints.length -1]) {
                System.out.println("second largest element is ::" + ints[i]);
                return;
            }

        }
        System.out.println("there is no second largest element");
    }


}
