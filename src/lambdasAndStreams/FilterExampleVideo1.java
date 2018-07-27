package lambdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExampleVideo1 {

	public static void main(String args[]) {
		
		List<String> players = Arrays.asList(
				"Kohli","Sachin", "Ganguly");
		System.out.println("**************Before Java 8 ****************");
		for(String player:players) {
			if(player.equals("Sachin")) {
				System.out.println("yes, sachin is in the squad");
			}
		}
		
		System.out.println("**************From Java 8 ****************");
		players.stream()
		.filter(new Predicate<String>() {
			@Override
			public boolean test(String player) {
				System.out.println("inside filter");
				return player.equals("Sachin");
			}
		})
		// forEach is terminal operation and it accepts something of type Consumer with accept method no return type
		// contrast it with Predicate 
		// this is called method reference
		.forEach(System.out::println);
	}
}
