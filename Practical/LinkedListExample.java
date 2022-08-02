package CollectionEg;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Mamta");
		al.add("Ram");
		al.add("Vijay");
		al.add("John");
		al.add("Amol");
		al.add(1, "Sree"); //adding with index position
		al.add("Priya");
		al.add("Mamta");
		al.addFirst("Karan"); //get added at beginning of list
		al.addLast("Rahul"); //get added at end of list
		
		//traversing using iterator
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.remove(4); 
		
		//traversing using list iterator
		ListIterator<String> itr1 = al.listIterator();
		System.out.println("-----------Forward Directions----------");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		System.out.println("----------Backward Direction-----------");
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
			
		}
		
		
		

	}

}
