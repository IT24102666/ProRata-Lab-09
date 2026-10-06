public class IT24102666Lab9Q3 {
	public static void main (String[] args) {

		int firtState = square(add(multiply(3,4), multiply(5, 7)));
		int scdState = add(square(add(4, 7)), square(add(8, 3)));

		System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + firtState);
		System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + scdState);

	}

	public static int add (int a, int b) {
		int addition = a + b;
		return addition;
	}

	public static int multiply (int a, int b) {
		int multipliedValue = a * b;
		return multipliedValue;
	}

	public static int square (int a) {
		int squared = a * a;
		return squared;
	}

}