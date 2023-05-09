import java.util.Arrays;

/**
 * Rajyalaxmi_Thumarada on 09-02-2023
 */
public class TestNumSmall {

    public static void main(String [] args){

        int sol = solution(new int[]{1,4,3,6,5} );
        System.out.println("sol ::: " + sol);

    }

    private static int solution(int[] ints) {
        int res = 0;
      //  Arrays.stream(ints).findAny(i)
        for (int i = 1; i <= ints.length; i++) {
           // Arrays.stream(ints).anyMatch(i)
            if (ints[i-1] > 0  && !Arrays.asList(ints).contains(i)) {
                res = i;
                break;
                //continue;
            }
        }

        return res;
    }


}
