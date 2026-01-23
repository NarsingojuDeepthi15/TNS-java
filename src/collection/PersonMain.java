package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> ob=new ArrayList<Person>();
		Person p=new Person("Yesh","Mumbai");
		ob.add(p);
		p=new Person("Teja","Hyderabad");
		ob.add(p);
		p=new Person("Kittu","Pune");
		ob.add(p);
		p=new Person("Kasi","Banglore");
		ob.add(p);
		
		System.out.println(ob);
		System.out.println("Sorting of Names");
		Collections.sort(ob, new SortByName());
		System.out.println(ob);
		
		System.out.println("Sorting of City");
		Collections.sort(ob,new SortByCity());
		System.out.println(ob);
	}

}
