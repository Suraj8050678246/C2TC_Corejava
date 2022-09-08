package Corejava_Package;

public class Oopsconcept1 {
	int year_ofpurchase; //data members
	String make;
	int model;
	double cost;
	public void Display1() //member Function
	{
		System.out.println("year of purs"+2001);
		System.out.println("make"+"suzuki");
		
	}
	void display2()
	{
		System.out.println("model"+1999);
		System.out.println("make"+ 500000);
	}
	public static void main(String[] args)
{
		
		Oopsconcept1 ob1=new Oopsconcept1();//objectcreation
		
		ob1.Display1();
		}
}
