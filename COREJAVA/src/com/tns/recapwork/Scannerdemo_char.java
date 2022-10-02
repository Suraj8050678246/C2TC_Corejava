package com.tns.recapwork;
import java.util.Scanner;
public class Scannerdemo_char
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		//char input
		char c=sc.next().charAt(0);
		System.out.println("c="+c);
	}
}
