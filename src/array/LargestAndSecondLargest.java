package array;

public class LargestAndSecondLargest {
	public static void main(String[] args) {

		int nums[] = { 23, 12, 56, 76, 64, 98, 78 };
		int maxOne = 0;
		int maxTwo = 0;
		for (int i = 0; i < nums.length; i++) {
			if (maxOne < nums[i]) {
				maxTwo = maxOne;
				maxOne = nums[i];
			} else if (maxTwo < nums[i]) {
				maxTwo = nums[i];
			}
		}
		System.out.println("Largest Number: " + maxOne);
		System.out.println("Second Largest Number: " + maxTwo);
	}
}
