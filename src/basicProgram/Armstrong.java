package basicProgram;

public class Armstrong {
	public static void main(String[] args) {
		int sum = 0, a, temp, n = 153;
		temp = n;
		while (n > 0) {
			a = n % 10;
			sum = sum + (a * a * a);
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
