
public class Buffer {

	private int value = 0;

	public int setValue(int value) throws InterruptedException {
		Thread.sleep((long) (Math.random() * 3001));
		if (this.value == 0) {
			this.value = value;
			return this.value;
		}
		return 0;
	}

	public int getValue() throws InterruptedException {
		Thread.sleep((long) (Math.random() * 3001));
		int res = this.value;
		this.value = 0;
		return res;
	}

}
