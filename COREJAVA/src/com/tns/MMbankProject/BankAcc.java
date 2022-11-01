package com.tns.MMbankProject;


public  abstract class BankAcc {
	
	private int accno;
	private String accNm;
	private float accBal;
	
	
	// Generating getter and setter methods
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	
	
	
	
	
	public void deposite(float deposite) {
		//if() {
			
		}


	public BankAcc(String mm)
	{
		
		
	}
	
	BankAcc(int accNo, String  accNm, float accBal){
		
	}
	
	public void withdraw (float withdraw) {
		
		if((this.getAccBal()- withdraw ) < 0) {
			System.out.println("Withdraw successful,Remaining Balance is= \n "+ this.getAccBal());
		}
		else {
			this.setAccBal(this.getAccBal() - withdraw);
			System.out.println("Withdraw successful,Current balance is = \n"+this.getAccBal());
		}
	}


	@Override
	public String toString(){//overriding the toString() method 
		
		  return accBal+" "+accNm+" "+accBal;  
		 }  


	}

