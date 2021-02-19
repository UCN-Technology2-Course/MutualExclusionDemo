
public class Buffer {

	private int value = 0;

	public void setValue(int value) {
				
		this.value = value;

		System.out.println(Thread.currentThread().getName() + " thread sets value " + this.value);
	}

	public int getValue() {
				
		System.out.println(Thread.currentThread().getName() + " thread reads value " + this.value);

		return this.value;
	}

}
