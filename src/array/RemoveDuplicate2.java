package array;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		int[] a = { 2, 33, 4, 2, 3,3, 9 };
		int[] tm = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				tm[j] = a[i];
				j++;
			}
		}
		tm[j] = a[a.length - 1];
		for (int i = 0; i < tm.length-1; i++) {
			System.out.print(tm[i] + " ");

		}
	}

}
