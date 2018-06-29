package primesRBeautiful;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomPrime2 {
	
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
	
	private static boolean isPrime(int a1) {
		
		for(int i = 2; i <= Math.sqrt(a1);i++ ) {
			
			if(a1 % i == 0) {
				return false;
			}
		}
		return true;
		
		
	}
	private static boolean isPrime2(int number) {
	    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}
	
	
	public static void main(String[] args) {
		
		//CustomPrime2 cp = new CustomPrime2();
		// List<Integer> l = cp.primesBetween(100, 200);
		
		List<Integer> ints = IntStream.rangeClosed(100, 200)
			    .boxed().collect(Collectors.toList());
		
		
		List<Integer> primes = ints.stream()
				.filter(CustomPrime2::isPrime2)
			    .filter(u -> (u%10 ==7)||(u%10 ==3))
				.collect(Collectors.toList());
		
		
		
		for(Integer i:primes) {
		System.out.println(i);
		}
		
	}

}

