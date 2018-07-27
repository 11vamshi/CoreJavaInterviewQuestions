package lambdasAndStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lambdasAndStreams.MapperExampleVideo2.User;

public class MapToIntAndSumVideo3 {
	
	public static void main(String args[]) {
		
		List<String> players = Arrays.asList(
				"Kohli","Sachin", "Ganguly");
		Map<String,User> userMap = new HashMap();
		
		userMap.put("Sachin",  new MapperExampleVideo2().new User("Sachin",40));
		
		
		List<Object> userList = players.stream()
				.filter(player -> player.equals("Sachin"))
				.map(new Function<String,Object>(){
					@Override
					public User apply(String player) {
						User user = userMap.get(player);
						return user;
					}
					
				})
				//.forEach(System.out::println);
				// OR
				.collect(Collectors.toList());
				userList.forEach(System.out::println);
				
				
				int sum = userList.stream().mapToInt(player -> ((User) player).getAge()).sum();
				System.out.println(sum);
		
	}

}
