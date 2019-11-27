package array;

import java.util.ArrayList;

public class LastElement {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.print("ArrayList: " + list);
		int first = list.get(0);
		int last = list.get(list.size() - 1);

		System.out.println("\nFirst : " + first + ", Last : " + last);
	}
}
