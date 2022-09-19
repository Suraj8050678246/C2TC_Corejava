package com.tns.classwork;

public class SuperkeyTest //parent class
{
	int var=100;
}
class TestChildClass extends SuperkeyTest //child class
{
	int var=50; // same variables [resent in both child and parent class

	void display()
	{
		System.out.println("The var value of child="  +var);
		System.out.println("The var value of child=" +super.var);
	}
}
class main
{
	public static void main(String[] args)
	{
		TestChildClass suraj=new TestChildClass();
		suraj.display();
	}
}
