package p08_Thread.SafeAndNoSafe;

public class Count {
	private int num;
	public void count() {
		for(int i = 1; i <= 10; i++) {
			num += i;
		}
		System.out.println(Thread.currentThread().getName() + "-" + num);
	}
}