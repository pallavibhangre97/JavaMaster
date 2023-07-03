package mostasked;

public class RemoveSpecCharString {

	public static void main(String[] args) {
		String str = "Pr!_o^gr#am%m*in&g Lan?#guag(e";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String  " + str);

	}

}
