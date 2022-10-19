package com.accenture;

public class Employee implements Comparable<Employee>
{
	
	Employee()
	{
		
	}
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public int compareTo(Employee o)
	{
		if(o.empId==empId)
		{
			return 0;
		}
		else if(o.empId>empId)
		{
			return -1;
		}
		return 1;
	}
	
}
