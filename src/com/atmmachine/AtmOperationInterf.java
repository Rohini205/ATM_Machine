package com.atmmachine;

public interface AtmOperationInterf {
	
	public void viewBalance();
	public void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositeAmount);
	public void viewMiniStatement();
}
