package com.tns.staticthings;

public class Employee 
{
	int empid;
	String name;
	static String company="Smart Programming";
	
	Employee(int empid, String name) //Constructor(String company)
	{
		this.empid = empid;
		this.name = name;
		/*this.company = company;*/
	} 
	
	void display() //method
	{
		System.out.println(empid+" "+name);//(+" "company)
	}
	public static void main(String[] args) //main method
	{
		Employee e1=new Employee(101,"Suraj"); //("Smart company")
				e1.display();
		Employee e2=new Employee(102,"Megha"); //("Smart company")
				e2.display();
		Employee e3=new Employee(101,"Soundarya"); //("Smart company")
				e3.display();
	}
}
