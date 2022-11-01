package com.tns.MMbankProject;


public  abstract class CurrentAcc extends BankAcc {

	 public CurrentAcc(int accNo, String accNm, float accBal,float creditlimt) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	 
	 
	 private final float cerditlimt=0;
	 
	 public abstract void withdraw();
	 public abstract String toString();
	 
	
	}

	
