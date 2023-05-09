import java.util.*;
import java.util.stream.Collectors;

/**
 * Rajyalaxmi_Thumarada on 11-02-2023
 */
public class ExampleFlatMap {

    public static void main(String [] args) {

        List<String> cities1 = new ArrayList<>();
        cities1.add("Pune");
        cities1.add("Mumbai");
        cities1.add("Gurgaon");
        cities1.add("Hyderabad");

        List<String> cities2 = new ArrayList<>();
        cities2.add("Pune");
        cities2.add("Gurgaon");
        cities2.add("Hyderabad");

        List<String> cities3 = new ArrayList<>();
        cities3.add("Chennai");
        cities3.add("Bangalore");
        cities3.add("Gurgaon");
        cities3.add("Hyderabad");

        Employee e1  = new Employee(1,"Code",cities1);
        Employee e2  = new Employee(2,"deCode",cities2);
        Employee e3  = new Employee(3,"CodedeCode",cities3);
        Employee e4  = new Employee(4,"CodedeCode",cities3);
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        System.out.println(emps);
        List<Integer> ids = emps.stream().map(e -> e.getId()).collect(Collectors.toList());
        System.out.println("ids ::: " + ids);

        Set<List<String>> cities = emps.stream().map(e -> e.getCities()).collect(Collectors.toSet());
        System.out.println("cities ::: " + cities);
        Set<String> citiesFlattened = emps.stream().flatMap(e -> e.getCities().stream()).collect(Collectors.toSet());
        System.out.println("citiesFlattened ::: " + citiesFlattened);

        //to find duplicate names
        Set<String> uniqueNames = new HashSet<>();
        List<String> duplicateNames   = emps.stream().map(e -> e.getName()).collect(Collectors.toList()).stream().filter(name -> !uniqueNames.add(name)).collect(Collectors.toList());
        System.out.println("duplicateNames :: " + duplicateNames);
        System.out.println("uniqueNames :: " + uniqueNames);
        List<String> namesList = emps.stream().map(e -> e.getName()).collect(Collectors.toList());
        Set<String> duplicates = namesList.stream().filter(name -> Collections.frequency(namesList,name) > 1).collect(Collectors.toSet());
        System.out.println("duplicates ::" + duplicates);
    }

}
