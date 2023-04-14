package com.interview;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	
	public static void main(String[] args) {
		

		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1, 1000l));
		empList.add(new Employee(2, 2000l));
		empList.add(new Employee(3, 3000l));
		empList.add(new Employee(4, 4000l));
		
		System.out.println("Orignal List===>"+empList);
		
		//salary Desc order
		
		List<Employee>	salaryDesc=empList.stream().sorted((p1,p2) -> (int) (p2.getSalary()-p1.getSalary())).collect(Collectors.toList());
			
			System.out.println("salaryDesc===>"+salaryDesc);
			
		//top 3 salary	
			List<Employee>	top3Salary=empList.stream().sorted((p1,p2) -> (int) (p2.getSalary()-p1.getSalary())).limit(3).collect(Collectors.toList());
			System.out.println("top 3 salary===>"+top3Salary);
			
	}
	

	
	
	
	
}
