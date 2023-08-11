package stream;

//Given a list of integers, find the total number of elements present in the list using Stream functions?
import java.util.ArrayList;
import java.util.List;

public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		myList.add(15);
		myList.add(20);
		myList.add(11);
		myList.add(40);
		myList.add(10);
		myList.add(17);
		Long aLong = myList.stream().count();
		System.out.println("Total element = " + aLong);
	}

}
