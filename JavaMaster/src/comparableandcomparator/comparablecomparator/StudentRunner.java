package comparableandcomparator.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
	public static void main(String[] args) {
		Student s = new Student(1, "pallavi", "pune");
		Student s1 = new Student(2, "sachin", "pune");
		Student s3 = new Student(3, "abha", "chinchwad");
		Student s2 = new Student(4, "abha", "pune");

		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		list.add(s3);
		list.add(s2);

		Collections.sort(list, new StudentNameComparator());
		for (Student s0 : list) {
			System.out.println(s0);
		}

		Collections.sort(list, new StudentIdComparator());
		for (Student s0 : list) {
			System.out.println(s0);
		}

	}
}
