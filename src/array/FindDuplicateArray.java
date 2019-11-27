package array;

public class FindDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "Dilip", "Ram", "Dilip", "Rahul","Ram" };
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].contains(s[j])) {
					System.out.println(s[j]);
				}
			}
		}
	}

}
