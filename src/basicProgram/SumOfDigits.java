package basicProgram;

public class SumOfDigits {
	public static void main(String[] args) {
		int n = 345, sum = 0, rem;

		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
