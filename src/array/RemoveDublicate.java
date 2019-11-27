package array;

import java.util.HashSet;

public class RemoveDublicate {

	public static void main(String[] args) {
		int[] a = { 8, 34, 3, 43, 3, 3 };
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (int n : hs) {
			System.out.print(n + " ");
		}
	}

}
