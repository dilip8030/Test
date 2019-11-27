package array;

public class StringDublicateSorting {

	public static void main(String[] args) {
		String s = "pDilip";
		int cnt = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					System.out.print(c[j]);
					cnt++;
					break;
				}
			}
		}
	}

}
