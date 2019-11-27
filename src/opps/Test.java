package opps;

class SuperClass {
	SuperClass get() {
		System.out.println("SuperClass");
		return this;
	}
}

public class Test extends SuperClass {

	Test get() {
		System.out.println("SubClass");
		return this;
	}

	public static void main(String[] args) {
		SuperClass tester = new Test();
		tester.get();
	}
}
