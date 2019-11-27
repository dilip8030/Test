package test;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Dilip Kumar Singh";
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);

		}
	}

}
