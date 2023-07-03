package mostasked;

//https://www.youtube.com/watch?v=Uywn0YzX8OQ&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=17
public class MissinginArry {

	public static void main(String[] args) {
//array should not have duplicate 
		// value should be in range
		// array no need to be in sorted order
		int sum = 0;
		int sum1 = 0;
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i : a) {
			sum = sum + i;
		}
		for (int i = 1; i <= 6; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("missing value= " + (sum1 - sum));

	}

}
