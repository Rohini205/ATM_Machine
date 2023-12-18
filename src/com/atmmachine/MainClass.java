package com.atmmachine;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		//create the object of the implementation class to call the implemented method
		AtmOperationImpl atmop=new AtmOperationImpl();
		
		int atmnumber=1234;
		int atmpin=123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !!!");
		System.out.println("Enter ATMNumber:");
		int atmNum=sc.nextInt();
		System.out.println("Enter Atmpin:");
		int pin=sc.nextInt();
		
		if((atmnumber==atmNum) && (atmpin==pin)) {
		while(true) {
			System.out.println("1.View Available balance\n2.withdraw Amount\n3.Deposite Amount\n4.View the miniStatement\n5.Exit");
			System.out.println("Enter choice: ");
			int ch=sc.nextInt();
			
			if(ch==1) {
				atmop.viewBalance();
				
			}
			else if(ch==2) {
				System.out.println("Enter withdrawn amount:");
				double withdrawAmount=sc.nextInt();
				atmop.withdrawAmount(withdrawAmount);
				
				
			}else if(ch==3) {
				
				System.out.println("Enter Amount to Deposit:");
				double depositeAmount=sc.nextDouble();
				atmop.depositAmount(depositeAmount);
				
				
			}else if(ch==4) {
				atmop.viewMiniStatement();
				
				
			}else if(ch==5) {
				
				System.out.println("Collect your ATM card\n Thank you for using ATM machine ");
				System.exit(0);
			}else {
				System.out.print("please enter the correct choice");
			}
		}
			
		}else {
			System.out.println("Incorrect AtmNumber or pin");
			System.exit(0);
		}
		
	}

}
