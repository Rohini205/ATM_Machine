package com.atmmachine;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {
	//created the object of the ATM class to fetch the data from the ATM
	ATM atm=new ATM();
	
	//Create the map to give the ministatement
	Map<Double,String> minstm=new HashMap<>();

	//To Check available balance
	@Override
	public void viewBalance() {
		System.out.println("Available balance is: "+atm.getBalance());
		
	}
	
	//To withdraw Amount
	@Override
	public void withdrawAmount(double withdrawAmount) {
		//To check the withdraw amount is multiple of 500 or not
		if(withdrawAmount%500==0) {
			//To check the withdraw amount is less than the available balance
			if(withdrawAmount<=atm.getBalance()) {
				
				minstm.put(withdrawAmount,"Amount Withdrawn");
			    System.out.println("Collect the cash:" +withdrawAmount);
			    atm.setBalance(atm.getBalance()-withdrawAmount);
			    viewBalance();
			
			}else {
				System.out.println("Insufficient balance !!!");
			}
		}
		else {
			System.out.println("Please enter the amount multiple of 500");
		}
		
	}
	//To deposit amount
	@Override
	public void depositAmount(double depositeAmount) {
		
		minstm.put(depositeAmount, "AmountDeposited");
		System.out.println(depositeAmount+"Deposited Successfully !!");
		atm.setBalance(atm.getDepositeAmount()+depositeAmount);
		viewBalance();
	}
	
	//To viewMini statement
	@Override
	public void viewMiniStatement() {
		
		for(Map.Entry<Double, String> m:minstm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
