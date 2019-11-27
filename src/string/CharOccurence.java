package string;

public class CharOccurence {
	public static void main(String args[]) {
		String str = "Yellow Yellow Yellow Red Green Megenta ";
		int yellow = getCount(str, "Yellow");
		int red = getCount(str, "Red");
		int green = getCount(str, "Green");
		int blue = getCount(str, "Blue");
		int megenta = getCount(str, "Megenta");

		System.out.println("red:" + red);
		System.out.println("green:" + green);
		System.out.println("blue:" + blue);
		System.out.println("megenta:" + megenta);
		System.out.println("yellow:" + yellow);
	}

	static int getCount(String str, String word) {
		String arr[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (word.contains(arr[i]))
				count++;
		}
		return count;
	}

}
