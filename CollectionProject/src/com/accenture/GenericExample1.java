package com.accenture;

import java.util.ArrayList;

public class GenericExample1 {

	public static void main(String[] args) 
	{
		ArrayList  list=new ArrayList();
		list.add("hello");
		list.add(10);
		list.add(1.2F);
		list.add(20);
		list.add("bye");
		list.forEach(str-> System.out.print(str));
		
	   getCal(list);
		
		
		
	}
	
	public static void getCal(ArrayList list)
	{
		float cal=0;
		//float f=0.0F;
		int x=0;
		for(Object item:list)
		{
			if(item.getClass().getName().endsWith("Float")) 
			{
				System.out.println(item.getClass().getName()+" "+item);
	
				cal=cal+(float)item;
			}
			else if(item.getClass().getName().endsWith("Integer"))
			{
				cal=cal+(int)item;
			}
			
		}
		System.out.println("Result is: "+cal);
	}

}
