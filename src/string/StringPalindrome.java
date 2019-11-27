package string;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "aba";
		if (isPalindrome(s)) {
			System.out.println("Palindrome:"+s);
		} else {
			System.out.println("Not Palindrome:"+s);
		}

	}

	private static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
