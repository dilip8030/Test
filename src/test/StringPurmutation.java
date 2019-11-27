package test;

public class StringPurmutation {
	 public static void main(String args[]){
	      int[] myArray = {93,34,27,80,30};
	      int i;
	      System.out.println("Even numbers in the given array are:: ");

	      for (i=0; i<myArray.length; i++){
	         if(myArray[i]%2 == 0){
	            System.out.print("Ev31.	WAP to sort the arrayen numbers:::::::::::"+myArray[i]);
	         }
	      }
	      System.out.println("Odd numbers in the given array are:: ");

	      for (i=0; i<myArray.length; i++){
	         if(myArray[i]%2 != 0){
	            System.out.println("Odd numbers:::::::::::"+myArray[i]);
	         }
	      }
	      
	   }
}
