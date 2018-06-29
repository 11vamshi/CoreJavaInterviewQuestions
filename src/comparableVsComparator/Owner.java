package comparableVsComparator;

public class Owner implements Comparable<Owner>{
	

	private String name;
	
	public Owner(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Owner anotherOwner) {
		// TODO Auto-generated method stub
		return this.name.compareTo(anotherOwner.getName());
	}
	@Override
	public String toString() {
		return "Owner [name=" + name + "]";
	}

}
