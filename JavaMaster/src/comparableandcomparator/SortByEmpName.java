package comparableandcomparator;

//in hashmap store employee object as key sort hashmap according to employee name in java //refer class Student,StudentNameComparator
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SortByEmpName {

	public static void main(String[] args) {

		HashMap<Student, String> map = new HashMap<>();

		Student s1 = new Student(1, "palla");
		Student s2 = new Student(1, "palla");
		Student s3 = new Student(3, "banesh");
		Student s4 = new Student(4, "adesh");

		map.put(s1, "mech");
		map.put(s2, "comp");
		map.put(s3, "civil");
		map.put(s4, "entc");

		List<Student> list = new LinkedList<>(map.keySet());

		Collections.sort(list, new StudentNameComparator());

		for (Student s : list) {
			// System.out.println(s.getId() + " " + s.getNameString());

			System.out.println(s.getId() + " " + s.getNameString() + " " + map.get(s));
		}

		System.out.println(s1.equals(s2));
	}

}
