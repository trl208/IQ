package com.demo.test;

import java.util.List;

/**
 * Rajyalaxmi_Thumarada on 02-03-2023
 */
public class Employee1 {
    private int id;
    private String name;

    private double salary;
    private List<String> cities;

    public Employee1(Integer id, String name, double salary ,List<String> cities) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", cities=" + cities +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getCities() {
        return cities;
    }
}
