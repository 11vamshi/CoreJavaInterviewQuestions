package lambdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Lambdas {
	public static void main(String[] args) {
		
		
		// before java 8, redundant code just to write core function, cuz java is imperative style prog lang
		Game footBall  = new Game() {
			@Override
			public void play() {
				System.out.println("I am playing foot ball");
			}
		};
		Game cricket  = new Game() {
			@Override
			public void play() {
				System.out.println("I am playing cricket");
			}
		};
		System.out.println("**************Before Java 8 ****************");
		cricket.play();
		
		
		// from java 8, dev. thought of introducing functional style prog. 
		Game footBallLambda = () -> System.out.println("I am playing foot ball");
		
		Series odiSeries = (type) -> System.out.println("The series is of type " + type); 
		
		System.out.println("**************From Java 8 ****************");
		// action part remains same
		odiSeries.play("ODI");
		
		// advantage is more visible if u have huge processing logic
		System.out.println("**************Before Java 8 ****************");
		List<String> players = Arrays.asList(
				"Kohli","Sachin", "Ganguly");
		for(String player:players) {
			if(player.equals("Sachin")) {
				System.out.println("yes, sachin is in the squad");
			}
		}
		
		// from java 8 streams are introduced, watch streams video, but before heading, understanding 
		// lambdas is very useful, lambdas go hand in hand with streams
		// with lambdas
		System.out.println("*************Streams with lambds*****************");
		players
		.stream()
		.filter(player -> 
			player.equals("Sachin"))
		.forEach(System.out::println);
		
		// findFirst returns optional, is nothing but a wrapper around an object, u can use it for null chacks 
		// and stuff like that
		Optional<String> optional = players
		.stream()
		.filter(player -> 
			player.equals("Sachin"))
		.findFirst();
		
		if(optional.isPresent()) {
			System.out.println("Yes");
		}
		
		
		System.out.println("*************Streams without lambds*****************");
		players
		.stream()
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
	// functional interface is the one which has only 1 method
	interface Game{
		void play();
	}
	
	interface Series{
		void play(String type);
	}

}
