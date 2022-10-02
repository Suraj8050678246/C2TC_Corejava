package com.tns.recapwork;

public class ForLoop {
	public static void main(String[] args)
	{
		int s=0,i;
		for( i=3; i<=50  ;i=i+3)
		{
			System.out.println(i);
			s=s+i;
		}
		System.out.println("Sum:" +s);
	}

}
