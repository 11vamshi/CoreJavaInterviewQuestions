package lambdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FlatMapperExampleVideo4 {

	public static void main(String[] args) {
		
		
		List<User> users = Arrays.asList(
				new User("Peter", 20, Arrays.asList("1","2")),
				new User("Sam", 40, Arrays.asList("3","4","5")),
				new User("Ryan", 60, Arrays.asList("6")),
				new User("Adam", 70, Arrays.asList("7","8"))
				);
		
		
		/*Optional<String> stringOptional = users.stream()
			 .map(new Function<User,Object>(){
				@Override
				public Object apply(User user) {
					 user.getPhones().stream();
					}
				})
				.flatMap(stringStream -> stringStream.filter(phoneNo ->  phoneNo.equals("5")))
				.findAny();
				
				
				
		stringOptional.ifPresent(System.out::println);*/
	}

	static class User {
		private String name;
		private Integer Age;
		private List<String> phones;

		public User(String name, Integer age, List<String> phones) {
			super();
			this.name = name;
			this.Age = age;
			this.phones = phones;
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

		public List<String> getPhones() {
			return phones;
		}

		public void setPhones(List<String> phones) {
			this.phones = phones;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", Age=" + Age + ", phones=" + phones + "]";
		}

	}
}