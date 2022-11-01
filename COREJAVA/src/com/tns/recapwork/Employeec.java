package com.tns.recapwork;

public class Employeec {

	String name;
	int emp_id;
	Employeec(String name, int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}
	public static void main(String[] args)
	{
		Employeec e1=new Employeec("deepak",101);
		Employeec e2=new Employeec("abc",102);
		System.out.println("Employee 1:"+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2:"+e2.name+" "+e2.emp_id);
	}
}