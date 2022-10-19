package com.accenture;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestComparable {

	public static void main(String[] args)
	{
		List<Employee> empList=new LinkedList<>();
		
		empList.add(new Employee(10003,"Amit"));
		empList.add(new Employee(10004,"Meera"));
		empList.add(new Employee(10001,"Raghav"));
		empList.add(new Employee(10002,"Raman"));
		Collections.sort(empList);
		for(Employee e:empList)
		{
			System.out.println(e.getEmpId()+" "+e.getEmpName());
		}
		
		
		
	}

}
