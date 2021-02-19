
public class Buffer {

	private int value = 0;

	public void setValue(int value) throws InterruptedException {
		Thread.sleep((long) (Math.random() * 3001));		
		this.value = value;
		System.out.println(Thread.currentThread().getName() + " thread sets value " + this.value);
	}

	public int getValue() throws InterruptedException {
		Thread.sleep((long) (Math.random() * 3001));
		System.out.println(Thread.currentThread().getName() + " thread reads value " + this.value);
		return this.value;
	}

}
