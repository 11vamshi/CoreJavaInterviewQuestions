package cloning;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class ClonableWithShallow implements Cloneable{
	
	int id;
	String name;
	ArrayList<AtomicInteger> numList;
	ChildObject child;
	
	
	public ClonableWithShallow(int id, String name, ArrayList<AtomicInteger> numList, ChildObject child) {
		super();
		this.id = id;
		this.name = name;
		this.numList = numList;
		this.child = child;
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
	public ArrayList<AtomicInteger> getNumList() {
		return numList;
	}
	public void setNumList(ArrayList<AtomicInteger> numList) {
		this.numList = numList;
	}
	
	
	
	public ChildObject getChild() {
		return child;
	}

	public void setChild(ChildObject child) {
		this.child = child;
	}

	
	
	@Override
	public String toString() {
		return "ClonableWithShallow [id=" + id + ", name=" + name + ", numList=" + numList + ", child=" + child + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		ClonableWithShallow clonedObj = (ClonableWithShallow) super.clone();
		
		// adding following lines makes deep-copy
		/*clonedObj.child = (ChildObject) this.child.clone();
		clonedObj.numList = (ArrayList<AtomicInteger>) this.numList.clone();
		*/
		return clonedObj;		
		
	}
	
	
	
}


