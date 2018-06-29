package comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DriverClass {
	public static void main(String[] args) {

		List<animal> mylist = new ArrayList<animal>();

		Owner o1 = new Owner("tommyOwner");
		Owner o2 = new Owner("cammyOwner");
		animal a1 = new animal(1, "tommy", o1);
		animal a2 = new animal(2, "cammy", o2);

		mylist.add(a1);
		mylist.add(a2);

		System.out.println("**************Sorting based on implicit quick sort**************");
		Collections.sort(mylist);
		System.out.println(mylist);

		System.out.println("**************Sorting based on user provided sort criteria**************");
		Collections.sort(mylist, new Comparator<animal>() {

			@Override
			public int compare(animal a1, animal a2) {
				return a1.getOwner().getName().compareTo(a2.getOwner().getName());
			}
			

		});
		
		System.out.println(mylist);

		System.out.println("**************Sorting based on user provided sort criteria using streams**************");

		mylist = mylist.stream()
				.sorted((animal1, animal2) -> animal1.getOwner().getName().compareTo(animal2.getOwner().getName()))
				.collect(Collectors.toList());

	    System.out.println(mylist);

	}
}
