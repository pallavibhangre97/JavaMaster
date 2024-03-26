
class A {

	private void add(int a, int b) {
		System.out.println(a + b);
	}
}

public class PrivateTst extends A {

	private void add(int a, int b) {
		System.out.println("jjj");
	}

	public static void main(String[] args) {
		PrivateTst t = new PrivateTst();
		t.add(1, 2);

	}

}
