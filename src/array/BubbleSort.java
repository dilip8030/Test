package array;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 1, 0, 1, 0 };
		/*int a[] = { 32, 4, 432, 12, 0, 12, 0 };*/
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
