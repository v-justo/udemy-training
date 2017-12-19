package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Justo";
		//w/ encapsulation
		acc1.setName("Justo");
		System.out.println(acc1.getName());
		
		acc1.setSSN("***-**-1234");
		System.out.println("SSN: " + acc1.getSSN());
		
		acc1.setAccountType("Checking");
		System.out.println("Account Type: " + acc1.getAccountType());
		//acc1.accountNumber = "0123";
		//w/ encapsulation
		acc1.setAccountNumer("0123");
		acc1.setRate();
		acc1.incRate();
		
		
		
		acc1.balance = 1000.44;
		
		acc1.deposit(1900);
		
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "4567";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "8901";
		
		/*
		acc3.checkBalance();
		
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 4000;
		cd1.name = "Xavier";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		
		*/

	}

}
