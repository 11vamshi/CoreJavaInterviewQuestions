package cloning;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

public class DriverClass {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

		ArrayList<AtomicInteger> list = new ArrayList();
		for (int i = 0; i < 12; i++) {
			list.add(new AtomicInteger(1));
		}

		ChildObject child = new ChildObject(1,"childName");
		ClonableWithShallow cws1 = new ClonableWithShallow(1, "first", list, child);

		ClonableWithShallow cws2 = (ClonableWithShallow) cws1.clone();

		System.out.println(cws1);
		System.out.println(cws2);
		
		ListIterator<AtomicInteger> i = cws1.numList.listIterator();

		while (i.hasNext()) {
			int current = i.next().get();
			i.set(new AtomicInteger(current + 1));

		}

		Thread t1 = new Thread(new ourThread(cws2));
		t1.start();

		
		i = cws1.numList.listIterator();
		while (i.hasNext()) {
			int current = i.next().get();
			System.out.println(current);

		}
		t1.join();
		System.out.println(cws1);
		System.out.println(cws2);

	}
}

class ourThread implements Runnable {
	private ClonableWithShallow clonedObject;

	public ourThread(ClonableWithShallow clonedObject) {
		this.clonedObject = clonedObject;
	}

	@Override
	public void run() {
		ListIterator<AtomicInteger> i = clonedObject.getNumList().listIterator();
		while (i.hasNext()) {
			int current = i.next().get();
			i.set(new AtomicInteger(current + 1));
		}
		
		clonedObject.child.setName("nameChanged");

	}

}