package pubmatic;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.nameString.compareTo(o2.nameString);
	}

}