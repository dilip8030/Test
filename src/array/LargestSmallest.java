package array;

public class LargestSmallest {
	//WAP to find lowest and greatest number from array
	public static void main(String[] args) {
		int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
		int min = a[0]; 
		int max = a[0]; 
		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}

}
