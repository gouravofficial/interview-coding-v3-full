package com.interview.intelJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    static List<String> projectList=new ArrayList<>();
    static {
        projectList.add("P-1");
        projectList.add("P-2");
        projectList.add("P-3");
        projectList.add("P-4");
        projectList.add("P-5");
    }
   static List<Employee> employeeList=new ArrayList<>();
    static {
        employeeList.add(
                new Employee("Gourav",25,50000.0,Arrays.asList("p1","p2","p3","p4")));
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
    //foreach
        //terminal operation
        employeeList.stream()
                .forEach(employee -> System.out.println(employee));

       //map
        //collect
        //intermidate
      List <Employee> emp=  employeeList.stream()
                .map(employee -> new Employee(
                        employee.getName(),
                        employee.getAge(),
                        employee.getSalary() * 1.0,
                        employee.getProjects()
                )).collect(Collectors.toList());

        System.out.println(emp);


        //filter

       List<Employee> employeesSalary= employeeList.stream()
                .filter(employee -> employee.getSalary() >5000.0).collect(Collectors.toList());
        System.out.println("salary >5000==>"+employeesSalary);

        //findFirst


        Employee findFirst= employeeList.stream()
                .filter(employee -> employee.getSalary() >5000.0)
                        .findFirst().orElse(null);
        System.out.println("findFirst >==>"+findFirst);

        //skip and Limit

      List<Employee> skipList=  employeeList.stream()
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println("Skip list==>"+skipList);

       //max or min

      Employee maxE= employeeList.stream()
               .max(Comparator.comparing(Employee::getSalary)).orElse(null);

        System.out.println("max salary="+maxE);

        //reduce
        //we need to accumalate opertion

     double sumsalary=   employeeList.stream()
                .map(employee -> employee.getSalary())
                .reduce(0.0,Double::sum);

        System.out.println("total salary==>"+sumsalary);

    }
}
