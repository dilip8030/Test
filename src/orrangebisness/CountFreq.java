package orrangebisness;

import java.util.HashMap;

public class CountFreq {
	private static void characterCount(String inputString) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = inputString.toLowerCase().toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {

				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {

				charCountMap.put(c, 1);
			}
		}

		System.out.println(inputString + " : " + charCountMap);
	}

	public static void main(String[] args) {
		String inputString="aaBbCcd";
		characterCount(inputString);
	}
}
