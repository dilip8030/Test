package array;

public class Palindrome {

	public static void main(String[] args) {
		int n=1216,rev=0,rem,temp;
		temp=n;
		for(;n!=0;n/=10){
			rem=n%10;
			rev=rev*10+rem;
		}
		if(temp==rev){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
