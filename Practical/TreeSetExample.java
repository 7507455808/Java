package CollectionEg;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> al = new TreeSet<String>();
		
		al.add("Mamta");
		al.add("Priya");
		al.add("Ram");
		al.add("Pooja");
		al.add("John");
		al.add("Ram");  // cannot take duplicate value
		al.add("Neha");
		al.add("Pallavi");
		
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
