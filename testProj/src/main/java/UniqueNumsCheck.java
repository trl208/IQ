import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * Rajyalaxmi_Thumarada on 14-03-2023
 */
public class UniqueNumsCheck {
    public static void main(String args[]) {
       // int[] arr = {1,2,2,1,1,3};
        int[] arr = {1,2,-2,-1,4,3};
        System.out.print(uniqueOccurrences(arr));

      /*  String soup = "hello";
        char[] soupArr=soup.toCharArray();
        Arrays.sort(soupArr);
        System.out.println(soupArr);
*/

    }

        public static boolean uniqueOccurrences(int[] arr) {
            TreeMap<Integer,Integer> occ = new TreeMap<>();
            for (Integer num : arr) {
                occ.merge(num,1,(oldval,newvalue) -> oldval + newvalue);

            }
            HashSet<Integer> nums = new HashSet<>();
            occ.values().stream().forEach(x -> nums.add(x));

            boolean unique = false;
            if(nums.size() == occ.size())
                unique=true;

            return unique;

        }

}
