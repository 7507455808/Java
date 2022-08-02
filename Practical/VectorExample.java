package CollectionEg;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> al = new Vector<String>();
		al.add("Mamta");
		al.add("Ram");
		al.add("Vijay");
		al.add("John");
		al.add("Amol");
		al.add(1, "Sree"); //adding with index position
		al.add("Priya");
		al.add("Mamta");
		
		//traversing using iterator
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.remove(3);
		
		System.out.println(al);
		
		al.add("Anu");
		al.add("Pooja");
		
		System.out.println(al.size());
		System.out.println(al);
		
		

	}

}
