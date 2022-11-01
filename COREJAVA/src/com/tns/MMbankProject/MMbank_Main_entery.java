package com.tns.MMbankProject;


public class MMbank_Main_entery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	a. Assign instance of MMBankFactory to BankFactory reference. 
		b. Instantiate MMSavingAcc and refer it through reference SavingAcc.
		c. Instantiate MMCurrentAcc and refer it through reference CurrentAcc.
		d. Invoke withdraw() method.
		e. Invoke toString() method*/
		
		//a 
		MMBankfactory BankFactory =new MMBankfactory();
		
		//b and c 
		/*public int getNewsavingacc(int accNo, String accNm, float accBal, boolean isSalried)*/
		MMSavingAcc SavingsACC = new  MMSavingAcc(54321, "user 1" , 20, true);
		MMCurrentAcc CurrentACC = new  MMCurrentAcc(12345, "user 2" , 11000 , 2000);
		
		
		
		// d and e 
		 SavingsACC.withdraw();
		 SavingsACC.toString();
		 CurrentACC.withdraw();
		 CurrentACC.toString();
		
		
		

	}

}