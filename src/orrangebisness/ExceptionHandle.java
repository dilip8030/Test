package orrangebisness;

public class ExceptionHandle {

	public static void main(String[] args) {
		try {
			int i, sum;
			sum = 10;
			for (i = 0; i < 3; i++) {
				sum = (sum / i);
			}
		} catch (ArithmeticException e) {
			System.err.println("0");
		}
		System.out.println(sum);
	}

}
