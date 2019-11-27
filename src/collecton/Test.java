package collecton;

import java.util.*;

public class Test {
	public static void main(String[] args) {
	ArrayList<String> L= new ArrayList<String>();
	L.add("Mumbai");
	L.add("Delhi");
	L.add("Calcutta");
	L.add("Agra");
	Collections.sort(L);
	System.out.println(L);
	String[] arr= {"Mumbai","Delhi","Agra"};
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]);
	}}
