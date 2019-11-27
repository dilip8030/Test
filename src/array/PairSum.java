package array;

public class PairSum {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, -1, 5 };
		int n = arr.length, sum = 6;
		printPairs(arr, n, sum);

	}

	static void printPairs(int arr[], int n, int sum) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")"+"="+sum);
				}
			}
		}
	}

}
