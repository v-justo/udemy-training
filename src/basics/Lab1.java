package basics;

public class Lab1 {

	public static void main(String[] args) {
		// Calculate a numbers factorial
		//1! = 1*1 = 1
		//2! = 2*1 = 2
		//3! = 3*2*1 = 6
		//4! = 4*3*2*1 = 24
		//5! = 5*4*3*2*1 = 120
		System.out.println(fac(6));
	}
	public static int fac(int n) {
		if (n == 1){
			return 1;
		}
		else if (n == 2) {
			return 2;
		}
		
		return fac(n-1) * n;
			}
		
		
		
		//return n;
	}


