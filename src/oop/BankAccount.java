package oop;

public class BankAccount implements IRate{
	//Define variables
	String accountNumber;
	//static >> belongs to the CLASS not the object instance
	//final >> constant (often static final)
	private static final String routingNumber = "9876";
	
	//Instance Variable
	private String name;
	private String ssn;
	private String accountType;
	double balance = 0.0;
	
	/*Constructor definition : unique methods
	1) they are used to define / setup / initialize properties of an object
	2) constructors are IMPLICITLY called upon instantiation
	3) same name as the class itself
	4) constructors have NO return type
	*/
BankAccount() {
	System.out.println("NEW ACCOUNT CREATED");
}
	/*Overloading: call same method name with diff. arguments
	 
	 */
BankAccount(String accountType){
	System.out.println("NEW ACCOUNT: " + accountType);
}
BankAccount(String accountType, double initDeposit){
	
	//initDeposit, accountType, Msg == local variables
	System.out.println("NEW ACCOUNT: " + accountType);
	System.out.println("INITIAL DESPOIT OF: $" + initDeposit);
	String msg = null;
	if(initDeposit < 1000){
		msg = "ERROR: inital deposit has to be more than $1000";
	} else {
		msg = "Thank you for your intial deposit of: $" + initDeposit;
	}
	System.out.println(msg);
	balance = balance + initDeposit;
}


//Getters & setters
//allow user to define name
public void setName(String name) {
	this.name = name;
}
public String getName(){
	return name;
}

public void setAccountNumer(String accountNumber){
	this.accountNumber = accountNumber;
}
public String getAccountNumber(){
	return accountNumber;
}

public void setSSN(String ssn){
	this.ssn = ssn;
}

public String getSSN(){
	return ssn;
}

public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}

//Interface methods
public void setRate(){
	System.out.println("Setting Rate");
}

public void incRate(){
	System.out.println("Increasing Rate");
}



	//Define methods:
/*Access Modifiers:
 *default == anywhere in the package
 *public == anywhere in the project
 *private == anywhere within the class
 *protected == default + through inheritance
 *Most Restricted to Least
 *4.)private
 *3.)default
 *2.)protected
 *1.)public
 */
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
		
	}
	
	void withdrawl(double withdraw) {
		balance = balance - withdraw;
		showActivity("Withdraw");
	}
	
	//private >> can only be called within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new blanace is: " + balance);
		
	}
	
	void checkBalance() {
		System.out.println("Balance is " + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ", " + "Account#: " + accountNumber + ", " + "Routing#: " + routingNumber + ". BALANCE: $" + balance + "]"; 
	}

}
