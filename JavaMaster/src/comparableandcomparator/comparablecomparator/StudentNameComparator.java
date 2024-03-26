package comparableandcomparator.comparablecomparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());// diff capital letter and small letter
	}
}
