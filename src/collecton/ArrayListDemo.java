package collecton;

import java.util.*; 

public class ArrayListDemo {
	
/*The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of 
  different datatypes. The ArrayList class maintains the insertion order and is non-synchronized.The elements stored 
  in the ArrayList class can be randomly accessed. Consider the following example.*/
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
         al.add("Dilip");
         al.add("Dilip");
         al.add("Deepak");
         al.add("Dasksh");
         al.add("Anoop");
         al.add("Rajesh");
         al.add("Dilip");
         Iterator itr=al.iterator();  
         while(itr.hasNext()){  
         System.out.println(itr.next()); 
         } 
	}

}
