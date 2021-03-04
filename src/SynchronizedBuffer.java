// Implementation of a synchronized buffer
public class SynchronizedBuffer implements Bufferable {


	private int value = 0;

	public synchronized int setValue(int value) throws InterruptedException {

		Thread.sleep((long) (Math.random() * 3001));

		while (this.value != 0) {
			wait();
		}

		this.value = value;
		System.out.println(Thread.currentThread().getName() + " thread sets value " + this.value);

		notify();
		
		return this.value;	
	
	}

	public synchronized int getValue() throws InterruptedException {

		Thread.sleep((long) (Math.random() * 3001));

		while (this.value == 0) {
			wait();
		}
		System.out.println(Thread.currentThread().getName() + " thread reads value " + this.value);

		int res = this.value;
		this.value = 0;

		notify();

		return res;
	}

}
