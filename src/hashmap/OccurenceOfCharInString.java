package hashmap;

import java.util.*;

public class OccurenceOfCharInString {
	public static void main(String[] args) {
		String s = "abcbdddaghjltrd";
		characterCount(s);

	}

	private static void characterCount(String s) {
		Map<Character, Integer> charCountMap = new TreeMap<>();
		char[] strArray = s.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}
}
