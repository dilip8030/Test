package orrangebisness;

public class Contructor {
	Contructor(Object o) {
		System.out.println("Obj");
	}

	Contructor(String s) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		Contructor c = new Contructor(null);
	}

}
