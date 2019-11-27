package orrangebisness;

public class Test {

	
	public static void main(String... s) {
		try {
			int i = 10 / 0;
		} catch (NullPointerException e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finnaly");
		}
		System.out.println("OutOfTry");
	}
}
