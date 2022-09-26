package com.tns.array;

public class Minimum {
public static void main(String[] args) {
	//void main(){
		int min=0;
	int arr[]= {20,10,30};
	 min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(min>arr[i])
		min=arr[i];
	}
	
	System.out.println(min);
	}
}