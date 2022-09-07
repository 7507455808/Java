package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaEg {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		
		al.add("Prem");
		al.add("Pooja");
		al.add("Komal");
		al.add("Chiu");
		
		// lambda
		al.forEach(
				
				(aa) -> System.out.println(aa)
				
				);
		System.out.println("________________");
		
		// iterating using method reference
		
		al.forEach(System.out::println);
				
				

	}

}
