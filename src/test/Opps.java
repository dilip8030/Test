package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Opps {

				public static void main(String[] args) {
					Map<Integer,String> h=new TreeMap<>();
					h.put(1,"Dilip");
					h.put(2,"Ram");
					h.put(3,"Daksh");
					h.put(2,"Raju");
					for(Integer i:h.keySet()){
						System.out.println("key:::::::::::::"+i);
					}
					for(String s:h.values()){
						System.out.println("values:::::::::::"+s);
					}
				}
				}
