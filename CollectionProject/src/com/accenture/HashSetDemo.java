package com.accenture;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo 

{

	public static void main(String[] args) 
	{
		Set <String>set=new HashSet<>();
		set.add("Amit");
		set.add("Amit");
		set.add("amit");
		set.add("Ravi");
		set.add(null);
		set.add(null);
		for(String s:set)
		{
			System.out.println(s);
		}
		
	}

}
