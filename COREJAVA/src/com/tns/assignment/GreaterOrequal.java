package com.tns.assignment;
import java.util.Scanner;
public class GreaterOrequal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			System.out.println("A is Bigger");
		}else if(b>c){
			System.out.println("b is Bigger");
		}
		else if(c>a){
			System.out.println("c is Bigger");
		}
		else
		{
			System.out.println("All are Same");
		}
	

	}

}