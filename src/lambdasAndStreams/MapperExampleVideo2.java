package lambdasAndStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapperExampleVideo2 {

	public static void main(String[] args) {
		
		List<String> players = Arrays.asList(
				"Kohli","Sachin", "Ganguly");
		Map<String,User> userMap = new HashMap();
		
		userMap.put("Sachin",  new MapperExampleVideo2().new User("Sachin",40));
		
		
		System.out.println("**************Before Java 8 ****************");
		for(String player:players) {
			if(player.equals("Sachin")) {
				System.out.println("yes, sachin is in the squad");
			}
		}
		
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
		
		
	}
	
	class User{
		private String name;
		private Integer Age;
		
		public User(String name, Integer age) {
			super();
			this.name = name;
			this.Age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return Age;
		}
		public void setAge(Integer age) {
			Age = age;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", Age=" + Age + "]";
		}
	
	}
	

}
