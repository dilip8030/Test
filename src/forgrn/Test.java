package forgrn;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String str = "bab";
		String rev="";
		int s1=str.length();
		for (int i = str.length() - 1;i>=0; i--) {
			rev=rev+str.charAt(i);
			if (str.equals(s1)) {
			System.out.println("Pelindrome");
			}else{
				System.out.println("not Pelindrome");
			}
		}


	}
}
