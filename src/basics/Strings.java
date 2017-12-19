package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Black";
		bookTitle = "Black Privilege";
		
		
		if(bookTitle.contains("Black")) {
			System.out.println("The book contains the word " +wordChoice);
		}
		
		String browser = "Firefox";
		if (browser.equalsIgnoreCase("firefox")){
			System.out.println("The browser is firefox");
		
		}
		String firstName = "Justo";
		String lastName = "V.";
		String SSN = "012345678";
		
		//Print intials + last 4 of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.subSequence(0, 1));
		System.out.print(SSN.substring(5, 9));
	
	}

}
