package collection;

import java.util.ArrayList;
import java.util.Collections;

public class DemoStudent {

	public static void main(String[] args) {
		ArrayList<Student> ob=new ArrayList<Student>();
		
		Student s=new Student(101,"John",98.2);
		ob.add(s);
		s=new Student(102,"Ahana",78.2);
		ob.add(s);
		s=new Student(102,"Cat",78.2);
		ob.add(s);
		s=new Student(102,"Benny",78.2);
		ob.add(s);
		System.out.println("Before sorting....");
		System.out.println(ob);
		System.out.println("After sorting....");
		Collections.sort(ob);
		System.out.println(ob);
	}

} 
