package CollectionEg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> al = new HashSet<String>();
		
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
		al.remove(2);
		
		System.out.println();
		
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		
		
		
		}

	}

}
