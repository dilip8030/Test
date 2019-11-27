package test;

public class A {
	public static void get(String s) {
		System.out.println("1");
	}
}

class B extends A {
	public static void get(String s) {
		System.out.println("2");
	}
}

class test {
	public static void main(String[] args) {
		A a = new B();
		a.get("S");
	}
}
