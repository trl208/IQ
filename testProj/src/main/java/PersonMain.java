import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Rajyalaxmi_Thumarada on 11-02-2023
 */
public class PersonMain {

    public static void main(String args[]) {

        List< Person > persons = Arrays.asList(
                new Person("Johnny", "Silverhand", 30),
                new Person("Johnny", "Mnemonic", 25),
                new Person("Molly", "Millions", 27)
        );

        List<String> lastnames = persons.stream().filter(p -> "Johnny".equals(p.getFirstName())).map(l -> l.getLastName()).collect(Collectors.toList());
        System.out.println("lastnames:::" + lastnames) ;
    }


}
