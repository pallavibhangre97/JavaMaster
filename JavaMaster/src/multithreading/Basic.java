package multithreading;

public class Basic extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		Basic basic = new Basic();
		basic.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(basic.getName());// name of child thread

	}

}
