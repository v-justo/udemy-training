package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.incRate();
		la.setRate();
		la.setAmortSchedule();
		la.setTerm(20);
		
		//polymorphism b/c changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.incRate();
		account1.setRate();

	}

}
