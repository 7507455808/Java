package java8;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEg {

	public static void main(String[] args) {
		List<Item> al = new ArrayList<Item>();
		
		al.add(new Item(1, "MI mobile", 15000));
		al.add(new Item(2, "Redmi mobile", 12000));
		al.add(new Item(3, "JIo mobile", 5000));
		al.add(new Item(4, "Lenevo mobile", 18000));
		al.add(new Item(5, "Apple mobile", 75000));
		al.add(new Item(6,  "mobile", 4500));

		// without stream
		List<Long> pp = new ArrayList<Long>();
		
		for(Item i : al) {
			//filter data of list
			if(i.price<10000) {
				pp.add(i.price); // adding price in new list pp
			}
		}
		System.out.println(pp);
		
		//with stream, filtering data, fetching data, storing to list
		List<Long> pp1 = al.stream().filter(i->i.price<10000).map(i->i.price).collect(Collectors.toList());
		System.out.println(pp1);
		//or
		al.stream().filter(i->i.price<10000).forEach(i->System.out.print(i.price));

	}

}
