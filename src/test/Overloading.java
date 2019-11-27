package test;

public class Overloading {
void get(String i){
	System.out.println("Dilip");
}
void get(Integer s){
	System.out.println("dd");
}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.get(null);

	}

}
