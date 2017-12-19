package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare & Define an array
		String[] cities = {"Atlanta", "Chicago", "Los Angeles", "Houston"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		
		//Declare array
		String[] countries;
		
		//Define array
		countries = new String[2];
		countries[0] = "USA";
		countries[1] = "Canada";
		
		//Declare an array (only size)
				String[] states = new String[5];
				states[0] = "Georgia";
				states[1] = "Illinois";
				states[2] = "Cali";
				states[3] = "Texas";
				states[4] = "Ohio";
				int i = 0;
				//do loop: enters the loop THEN test condition
				do{
				System.out.println("STATE: "+states[i]);
				i = i + 1;
				}while (i<5);
				
				//while loop: tests condition first then enters loop
				int j = 0;
				boolean stateFound = false;
				while (!stateFound) {
					String state = states[j];
					System.out.println(states);
					if(state == "Cali"){
						System.out.println("State Found!!");
						stateFound = true;
					}
					j++;
				}
				
				//for loop: best structure for ierating through an array
				for(int x = 0; x < 5; x++) {
					System.out.println(states[x]);
				}
		

	}

}
