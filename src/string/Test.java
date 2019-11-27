package string;

public class Test {

	public static void main(String[] args) {
		String str = "dilip_kumarSingh";
	    StringBuilder sb = new StringBuilder();
	    String[] splited = str.trim().split("\\s+");

	    for (String string : splited) {         
	        String s1 = string.substring(0, 1).toLowerCase();
	        String s = s1 + string.substring(1);
	        sb.append(s.replaceAll("(.)([A-Z])", "$1_$2").toLowerCase());
	    }
	    System.out.println(sb.toString().trim());

	}

}
