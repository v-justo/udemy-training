package basics;

public class NumbersCalc {
	
	public static void main(String[] args){
		System.out.println("Program is starting: ");
		printName();
		int numA = 10;
		int numB = 20;
		addNum(numA, numB);
		System.out.println("The product of "+ numA + " and " + numB + " is: " +multipleNum(numA, numB));
	}

	static void printName(){
		System.out.println("My name is Justo.");
	}
	
	static void addNum(int numA, int numB){
		//add two numbers
		int sum = numA + numB;
		System.out.println("The sum of "+ numA +" and " + numB+" is "+ sum);
	}
	
	static int multipleNum(int numA, int numB){
		int product = numA * numB;
		return product;
		
	}
	
	
}
