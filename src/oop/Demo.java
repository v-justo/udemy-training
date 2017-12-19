package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void grinding(){
		System.out.println(name + " is grinding");
	}
	void stunting() {
		System.out.println(email);
		
	}
	void cappin() {
		System.out.println(name + " isn't cappin.");
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Justo";
		p1.email = "justoemail@email.com";
		p1.phone = "1234567890";
		
		p1.grinding();
		p1.stunting();
		p1.cappin();
		/*Person -
		
		//Attributes, Variables, Adjectives, Descriptors
		String name = "Justo";
		String email = "justov@gmail.com";
		String phone = "7049605457";

		//Action, Activity, Behavior
		//System.out.println(name + " is griding");
		grinding(name);
		System.out.println(name + " is stunting");
		
		//What if we wnted to do this for anotheer person?
		String name2 = "Ruby";
		String email2 = "rubyn@gmail.com";
		String phone2 = "1234567890";

		//Action, Activity, Behavior
		//System.out.println(name2 + " is griding");
		grinding(name2);
		System.out.println(name2 + " is stunting");
	}
	//Enhance by adding functions to minimize code
	static void grinding(String name) {
		System.out.println(name +" is grinding.");
	}
	*/
	}

}
