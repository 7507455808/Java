package CollectionEg;

public class Student implements Comparable<Student> {
		
		int sid;
		String sname;
		long sphone;
		int age;
		
		public Student(int sid, String sname, long sphone) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.sphone = sphone;
			this.age = age;
		}
		public int compareTo(Student s) {
			if(age == s.age)
				return 0;
			else if (age > s.age)
				return 1;
			else
				return -1;
			
			
		}
		
		
		

	}


