package com.accenture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		
		List<String> list=new ArrayList<>();
		list.add("Amit");
		list.add("Neelam");
		list.add("Neelam");
		list.add("Amit");
		list.add("Raghav");
		list.add(null);
		list.add(null);
		list.add(null);
		List<Employee> empList=new LinkedList<>();
		empList.add(new Employee(10001,"Raghav"));
		empList.add(new Employee(10002,"Raman"));
		empList.add(new Employee(10003,"Amit"));
		empList.add(new Employee(10004,"Meera"));
		
		//Iterator it=empList.iterator();
		ListIterator it=empList.listIterator();
		
		/*
		 * while(it.hasNext()) { Employee e=(Employee)it.next();
		 * 
		 * System.out.println(e.getEmpId()+" "+e.getEmpName()); }
		 */
		
		  for(String s:list) { System.out.println(s); }
		  
		 // list.forEach(s -> System.out.println(s));
		  
		  
		 	}

}
