package array;

import java.util.*;

//Java program remove all occurrences 
//of an element from Array using naive method 
public class RemoveAllOccurrences {
	public static int[] removeElements(int[] arr, int key) {
		int index = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != key)
				arr[index++] = arr[i];
		return Arrays.copyOf(arr, index);
	}

	public static void main(String[] args) {
		int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int key = 3;
		array = removeElements(array, key);
		System.out.println(Arrays.toString(array));
	}
}
