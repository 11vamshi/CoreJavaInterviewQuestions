package comparableVsComparator;

public class animal implements Comparable<animal> {
	private int id;
	private String name;
	private Owner owner;

	public animal(int i, String name, Owner o) {
		// TODO Auto-generated constructor stub
		id = i;
		this.name = name;
		this.owner = o;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(animal anotheranimal) {

		// task 1
		// below piece of code returns sorted elements based on ids
		/*
		 * if (this.id < anotheranimal.getId()) return -1; else if (this.id >
		 * anotheranimal.getId()) return 1; else return 0;
		 */
		
		// task 2
		// below code returns sorted elements based on name field
		// return this.name.compareTo(anotheranimal.getName());

		// task 3
		// below code returns sorted elements based on name, if names clash, they are sorted by id
		if (this.name.compareTo(anotheranimal.getName()) == 0) {
			if (this.id < anotheranimal.getId())
				return -1;
			else if (this.id > anotheranimal.getId())
				return 1;
			else
				return 0;
		} else
			return this.name.compareTo(anotheranimal.getName());

		// task 4
		// below line compares animals by owner's ordering criteria, which is name in
		// this case
		// return this.getOwner().compareTo(anotheranimal.getOwner());

	}

	public Owner getOwner() {
		return owner;
	}

	@Override
	public String toString() {
		return "animal [id=" + id + ", name=" + name + ", owner=" + owner.toString() + "]";
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
