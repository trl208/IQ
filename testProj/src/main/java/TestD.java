import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Rajyalaxmi_Thumarada on 13-02-2023
 */
public class TestD {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "test",  "cba",  "hello");
        System.out.println("strings:::: before sort " + strings);
        Collections.sort(strings,  (String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                return 0;
            }
        } );

        System.out.println("strings:::: " + strings);

        List<String> names = new ArrayList<>(List.of("Johnny Mnemonic", "Rick Deckard", "Kevin Flynn"));
        names.replaceAll(name -> name.split(" ")[1]);
        names.forEach(System.out::println);



    }

}
