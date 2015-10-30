package NF9;

public class Exercici3 {
	private static float dividend;
	private static float divisor;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divisio(6, 2);
		} catch (ArithmeticException e) {
			System.out.println("error, el divisor és 0!");
		}
	}

	static void divisio(float dividend, float divisor) {
		if (divisor == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(dividend / divisor);
		}
	}
}
