package pubmatic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	public String nameString;
	public int age;

	public Employee(int age, String naeString) {

		this.age = age;
		this.nameString = naeString;
	}

	// compare by age
//	public int compareTo(Employee o) {
//
//		if (age == o.age) {
//			return 0;
//		} else if (age > o.age) { // if reverse order then change 1 to -1
//			return -1;
//		} else {
//			return 1;
//		}
//	}

	// compare by name
	public int compareTo(Employee e) {
		return nameString.compareTo(e.nameString);
	}
}

public class SortEmployeeByName {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(2, "pallavi");
		Employee e2 = new Employee(4, "sachin");
		Employee e3 = new Employee(6, "sagar");
		Employee e4 = new Employee(2, "sanvi");
		Employee e5 = new Employee(1, "anvi");

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Collections.sort(list);

		System.out.println("list after sorting");

		for (Employee e : list) {
			System.out.println(e.nameString + " " + e.age);
		}

	}

}
