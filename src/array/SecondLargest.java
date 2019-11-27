package array;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[] = { 23, 12, 56, 76, 64, 98, 78 };
		int large = arr[0];
		int large2 = arr[0];
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large2 = large;
				large = arr[i];
			} else if (arr[i] > large2) {
				large2= arr[i];
			}
		}
		System.out.println("large:::" + large2);
	}

}
