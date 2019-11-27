package orrangebisness;

public class Test4 {
	int a;
	int b;

	Test4(int i, int j) {
		a = i;
		b = j;
	}

	void menthod(Test4 o) {
		o.a *= 2;
		o.b /= 2;
	}
}

class Output1 {
	public static void main(String[] args) {
		Test4 t = new Test4(10, 20);
		t.menthod(t);
		System.out.println(t.a+" "+t.b);
	}
}
