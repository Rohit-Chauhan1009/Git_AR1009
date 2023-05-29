package com.greatlearning.corejava;

public class Account {
	String CustomerName;
	int Accountno;
	Account(String a, int b){
		CustomerName = a;
		Accountno = b;
	}
	void display() {
		System.out.println("The Customer Name is :" + CustomerName);
		System.out.println("The Customer Account No. is :" + Accountno);
	}
}

class CurrentAccount extends Account{
	int currentBalance;
	CurrentAccount(String a, int b, int c){
		super(a,b);
		currentBalance =c;
	}
	void display() {
		super.display();
//		System.out.println("The Customer Name is : "+ super.CustomerName +"The Customer Account No. is : " + super.Accountno +".The Custome currentBalance is :" + currentBalance );
		System.out.println(".The Custome currentBalance is :" + currentBalance);
	}
}

class AccountDetails extends CurrentAccount{
	int DepositAccount, withdrawAccount;
	public AccountDetails(String a, int b, int c, int d, int e) {
		// TODO Auto-generated constructor stub
		super(a,b,c);
			DepositAccount = d;
			withdrawAccount = e;
		}
	void display() {
		super.display();
//		System.out.println("The Customer Name is : "+ super.CustomerName);
//		System.out.println("The Customer Account No. is : " + super.Accountno);
//		System.out.println("The Customer currentBalance is :" + super.currentBalance);
		System.out.println("The Customer Deposit Account is :"+ DepositAccount);
		System.out.println("The Customer WithDraw Account is :" + withdrawAccount);
	}
	
}