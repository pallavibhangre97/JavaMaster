package pubmatic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//refer class Employee1,Namecomparator 
public class TestComparator {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		Employee1 e1 = new Employee1(2, "pallavi");
		Employee1 e2 = new Employee1(4, "sachin");
		Employee1 e3 = new Employee1(6, "sagar");
		Employee1 e4 = new Employee1(2, "sanvi");
		Employee1 e5 = new Employee1(1, "anvi");

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		System.out.println("list after sorting by name ");
		Collections.sort(list, new NameComparator());

		for (Employee1 e : list) {
			System.out.println(e.nameString + " " + e.age);
		}

		Collections.sort(list, new AgeComparator());

		System.out.println("liast after sorting by age ");
		for (Employee1 e : list) {
			System.out.println(e.nameString + " " + e.age);
		}

	}

}
