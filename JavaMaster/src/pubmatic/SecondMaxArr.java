package pubmatic;

//https://www.youtube.com/watch?v=_3S1Hvb-ZGg
public class SecondMaxArr {

	public static void main(String[] args) {

		int arr[] = { 20, 1, 4, 7, 8, 9 };
		secondMax(arr);

	}

	private static void secondMax(int[] arr) {

		int max = 0, smax = 0;
		for (int a : arr) {
			if (a > max) {
				smax = max;
				max = a;
			} else if (a > smax && a != max) {
				smax = a;
			}
		}

		System.out.println("max = " + max);
		System.out.println("second max = " + smax);
	}

}
