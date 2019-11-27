package orrangebisness;

public class M {
	int a;

	M(int a) {
		this.a = a;
	}
}

class Test1 {
	public static void main(String... args) {
		M m = new M(2);
		if (m.a == 2) {
			System.out.println("success");
		} else {
			System.out.println("failed"+m.a);
		}
	}
}
