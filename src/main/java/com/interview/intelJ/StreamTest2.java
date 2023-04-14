package com.interview.intelJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {

    static List<Employee> employeeList=new ArrayList<>();
    static {
        employeeList.add(
                new Employee("Gourav",25,50000.0, Arrays.asList("p1","p2","p3","p4")));
        employeeList.add(
                new Employee("Sourav",21,1000.0,Arrays.asList("p1","p2","p3","p4")));
        employeeList.add(
                new Employee("Neeraj",28,3000.0,Arrays.asList("p1","p2","p3","p5")));
        employeeList.add(
                new Employee("Sandeep",30,25000.0,Arrays.asList("p1","p2","p3","p6")));
        employeeList.add(
                new Employee("Ankit",55,5000.0,Arrays.asList("p1","p2","p3","p7")));
    }

    public static void main(String[] args) {

        employeeList.stream().forEach(System.out::println);

      List<Employee> mapList=  employeeList.stream().map(employee -> new Employee(employee.getName()
        , employee.getAge(), employee.getSalary()*1.10, employee.getProjects() ))
                .collect(Collectors.toList());

        System.out.println("map==>"+mapList);

      List<Employee> filterList= employeeList.stream().filter(e->e.getSalary()<=5000.0).collect(Collectors.toList());

        System.out.println("FilterList===>"+filterList);

        List<Employee> skipList= employeeList.stream().skip(1).limit(1).collect(Collectors.toList());

        System.out.println("skip="+skipList);

       Employee max= employeeList.stream().max(Comparator.comparing(employee -> employee.getSalary())).orElse(null);
        System.out.println("max==>"+max);

       double sumsal= employeeList.stream().map(employee -> employee.getSalary()).reduce(0.0,Double::sum);
        System.out.println("sum==>"+sumsal);
    }
}
