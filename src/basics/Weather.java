package basics;

public class Weather {
	public static void main(String[] args){
		//give suggestions of what to wear based on weather(temp)
		
		int temp = 65;
		String sunCondition = "Overcast";
		
		if(temp > 80){
			System.out.println("It's above 80 degrees, advise shorts & t-shirts.");
			
		}
		else if ((temp > 60)||(sunCondition == "Sunny")){
			System.out.println("It's a lil colder, advise long-sleeve & pants.");
			System.out.println("Sunny so wear hat.");
		}
		
		else {
			System.out.println("It's less than 60 degrees, advise coat.");
		}
		System.out.println("The program is ending!");
	}
}
