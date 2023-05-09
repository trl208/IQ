/**
 * Rajyalaxmi_Thumarada on 23-02-2023
 */
public class SumOfNRecursive {

    public static void main(String args []) {

        int n = 4;
        System.out.println( calculateSum(n) );

    }

    private static int calculateSum(int n) {
        int sum = 0;
        if (n == 0 || n == 1) {
            sum = sum + n;
        } else{
            sum = calculateSum(n-1) + n;
        }
        return sum;
    }

}
