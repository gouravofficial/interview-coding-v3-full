package com.interview.intelJ;

import java.util.List;

public class Employee {


    private String name;
    private int  age;
    private double salary;
    private List<String> projects;

    public Employee(String name, int age, double salary, List<String> projects) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }



}
