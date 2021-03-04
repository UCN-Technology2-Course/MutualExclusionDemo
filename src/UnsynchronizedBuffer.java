// Implementation of an unsynchronized buffer
public class UnsynchronizedBuffer implements Bufferable {

	private int value = 0;
	
	@Override
	public int setValue(int value) throws InterruptedException {
		Thread.sleep((long) (Math.random() * 3001));

		if (this.value == 0) {
			this.value = value;
			return this.value;
		}
		return 0;
	}

	@Override
	public int getValue() throws InterruptedException {
		Thread.sleep((long) (Math.random() * 3001));

		//System.out.println(Thread.currentThread().getName() + " thread reads value " + this.value);

		int res = this.value;
		this.value = 0;

		return res;
	}

}
