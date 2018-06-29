package primesRBeautiful;

import java.util.ArrayList;
import java.util.List;

public class CustomPrime {
	
	public List<Integer> primesBetween(int a1, int a2){
		
		List<Integer> result = new ArrayList<Integer>();
 		
		for(int i = a1; i < a2;i++) {
			
			if(isPrime(i)) {
				if(i% 10 == 3 || i%10 == 7) {
					result.add(i);
				}	
			}		
		}
		return result;
	}
	
	private boolean isPrime(int a1) {
		
		for(int i = 2; i <= Math.sqrt(a1);i++ ) {
			
			if(a1 % i == 0) {
				return false;
			}
		}
		return true;
		
		
	}
	
	
	public static void main(String[] args) {
		
		CustomPrime cp = new CustomPrime();
		List<Integer> l = cp.primesBetween(100, 200);
		
		for(Integer i:l) {
		System.out.println(i);
		}
		
	}

}

