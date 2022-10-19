package com.accenture;

public class TestTypeSafety {

	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setEmpId(1001);
		e.setEmpName("Amita");
		TType <Float,Employee>t=new TType<>();
		t.settId(1000.0F);
		t.setMember2(e);
		System.out.println(" ID: "+t.gettId()+" "+t.getMember2().getEmpId()+" "+t.getMember2().getEmpName());
	}

}
