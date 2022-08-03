package CollectionEg;


import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> al = new 	LinkedHashSet<String>();
		
		al.add("Mamta");
		al.add("Priya");
		al.add("Ram");
		al.add("Pooja");
		al.add("John");
		al.add("Ram");  // cannot take duplicate value
		al.add("Neha");
		al.add("Pallavi");
		al.add(null);  //allows null values
		
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

	}

	}
}
