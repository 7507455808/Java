package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(); //creating arraylist
		
		al.add("mamta"); //adding object in list 
		al.add("sachin");
		al.add("aditya");
		al.add("shubham");
		al.add("chandana");
		al.add("kubra");
		al.add("madhavi");
		al.add("shubham");
		
		System.out.println("before sorting");
		for(String a : al) {
			System.out.println(a);
		}
		Collections.sort(al); //sort list
		
		System.out.println();
		System.out.println("after sorting");
		for(String a : al) {
			System.out.println(a);
		}
		System.out.println("---------------");
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(101);
		all.add(102);
		all.add(103);
		all.add(104);
		all.add(105);
		all.add(106);
		all.add(107);
		
		System.out.println("before sorting");
		for(int a : all) {
			System.out.println(a);
		}
		Collections.sort(all); //sort list
		
		System.out.println();
		System.out.println("after sorting");
		for(int a : all) {
			System.out.println(a);
			
		}
		
		

	}

}
