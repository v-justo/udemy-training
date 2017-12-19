package oop;

public class LoanAccount implements IRate{

	public void setRate() {
		System.out.println("Setting Rate");
		
	}

	public void incRate() {
		System.out.println("Increase Rate");
		
	}
	
	public void setTerm(int terms) {
		System.out.println("Setting the term to: " + terms + " years.");
	}
	
	public void setAmortSchedule() {
		System.out.println("Amortization schedule");
	}
	

}
