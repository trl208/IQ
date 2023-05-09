import java.util.List;

/**
 * Rajyalaxmi_Thumarada on 11-02-2023
 */
public class Employee {
    private int id;
    private String name;
    private List<String> cities;

    public Employee(Integer id, String name, List<String> cities) {
        this.id = id;
        this.name = name;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getCities() {
        return cities;
    }
}
