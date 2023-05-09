import java.util.TreeMap;

/**
 * Rajyalaxmi_Thumarada on 13-03-2023
 */
public class NamesCountUsingMerge {

    public static void main(String args []) {

        String[] names = {"Johnny", "Rick", "Johnny", "Kevin", "Johnny", "Rick"};
        TreeMap<String,Integer> namesCount = new TreeMap<>();
        for(String name : names) {
            namesCount.merge(name,1,(oldcount,newvalue) -> oldcount + newvalue);
        }
        namesCount.forEach((name,count) -> System.out.println(name + ":" + count));


    }

}
