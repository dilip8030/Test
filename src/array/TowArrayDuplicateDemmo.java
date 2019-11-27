package array;

import java.util.ArrayList;

public class TowArrayDuplicateDemmo {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Dilip");
		l1.add("Ram");
		l1.add("Raju");
		System.out.println("List1:::"+l1);
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Dilip");
		l2.add("syam");
		l2.add("raju");
		
		System.out.println("List2:::"+l2);
		
		l1.retainAll(l2);
		System.out.println("Commons:::"+l1);
		
		//java 8
		//System.out.println("Commons:::"+l1.stream().filter(l2)::contains.collect(toList()));

	}

}
