import java.util.Arrays;
import java.util.HashSet;

/**
 * Rajyalaxmi_Thumarada on 18-03-2023
 */
public class CharacterFrequency {
    public static final int SIZE = 26;
    public static void main(String args[]) {
        String str = "frequency";
        getCharacterFrequecy(str);
       // System.out.println("In main of CharacterFrequency:::: " + getCharacterFrequecy(str) );

    }

    private static void getCharacterFrequecy(String str) {
        int[] freq = new int[SIZE];
        int n = str.length();


        for(int i=0; i<n; i++) {
            freq[str.charAt(i) - 'a']++;

        }
        for(int i = 0; i < n; i++) {
            int i1 = freq[str.charAt(i) - 'a'];
            if(i1 != 0) {
                System.out.print(str.charAt(i));
                System.out.print(i1 + " ");

                freq[str.charAt(i) - 'a'] = 0;

            }
        }

        //return str;
    }


}
