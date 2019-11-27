package collecton;
import java.util.*; 
public class LinkedListDemo {
	public static void main(String args[]){
		
		/*LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
		It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, 
		the manipulation is fast because no shifting is required*/
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Anoop");
		ll.add("Dilip");
		ll.add("Deepak");
		ll.add("Dasksh");
		ll.add("Anoop");
		ll.add("Rajesh");
		ll.add("Dasksh");
		Iterator i= ll.iterator(); 
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}
