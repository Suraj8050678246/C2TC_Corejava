package com.tns.MMbankProject;



public  abstract class  SavingAcc extends BankAcc {
	

	
	
	
	

	SavingAcc(int accNo, String accNm, float accBal , boolean isSalaried) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	private boolean isSalaried;
	private float MINBAL;
	public abstract void withdraw();
	public abstract String toString();
	
	
		



		
}
	 
