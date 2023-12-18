package com.atmmachine;

public class ATM {
	
	private double balance;
	private double depositeAmount;
	private double withrawAmount;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public double getWithrawAmount() {
		return withrawAmount;
	}
	public void setWithrawAmount(double withrawAmount) {
		this.withrawAmount = withrawAmount;
	}
	
	public ATM(double balance, double depositeAmount, double withrawAmount) {
		super();
		this.balance = balance;
		this.depositeAmount = depositeAmount;
		this.withrawAmount = withrawAmount;
	}
	
	public ATM() {
		
	}
	
	
}
