package leetcode.easy;

//https://www.youtube.com/watch?v=YDlv6RnoSSA&t=1249s
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than n / 2 times. You may assume that the majority //element always exists in the array.
public class MajorityElement {
	public static void main(String args[]) {

		int arr[] = { 3, 2, 3 };

		int maj = arr[0];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == maj) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				maj = arr[i];
				count = 1;
			}
		}
		System.out.println(maj);
	}
}
