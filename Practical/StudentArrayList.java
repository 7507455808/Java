package CollectionEg;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		//create object of Student
		
		Student s = new Student(1, "pallavi" ,98765432);
		Student s1 = new Student(2, "pooja" ,87654321);
		Student s2 = new Student(3, "jatin" ,7654321);
		Student s3 = new Student(4, "madhavi" ,88654321);
		Student s4 = new Student(5, "shivani" ,907654321);
		Student s5 = new Student(6, "chandana" ,78884321);
		
		ArrayList<Student> al = new ArrayList<Student>(); //create arraylist of student datatype
		
		al.add(s); //adding student object
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		System.out.println("-------Student List----------");
		
		Iterator<Student> itr = al.iterator(); //get iterator
		//traversing element of list
		while(itr.hasNext()) {
			Student st = itr.next(); //printing list until element
			
			System.out.println(st.sid + " " + st.sname + " " +st.sphone);
		}
		al.remove(4); // remove element from list
		
		System.out.println("-----------Student List After Delete---------");
		
		Iterator<Student> itr1 = al.iterator(); //get iterator
		//traversing element of list
		while(itr1.hasNext()) {
		Student st = itr1.next(); //printing list until next element
		
		System.out.println(st.sid + " " + st.sname + " " +st.sphone);
		
				
		
		
		
		
		}

	}

	}
