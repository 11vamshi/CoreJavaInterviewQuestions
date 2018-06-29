package cloning;

public class ChildObject implements Cloneable{
	
	int id;
	String name;
	
	public ChildObject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "ChildObject [id=" + id + ", name=" + name + "]";
	}
	

}
