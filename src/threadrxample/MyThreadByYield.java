package threadrxample;

public class MyThreadByYield extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}
}

class yieldDemo {
	public static void main(String[] args) {
		MyThreadByYield t = new MyThreadByYield();
		t.start();
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}
