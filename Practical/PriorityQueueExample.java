package CollectionEg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> al = new PriorityQueue<String>();
		al.add("mamta");
		al.add("sachin");
		al.add("aditya");
		al.add("chandana");
		al.add("kubra");
		al.add("madhavi");
		al.add("shubham");
		
		System.out.println("Peek element : " +al.peek());
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		al.remove();
		
		System.out.println();
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
		
		

	}

}
