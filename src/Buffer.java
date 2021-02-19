
public class Buffer {

	private int value = 0;

	public void setValue(int value) {

		System.out.println(Thread.currentThread().getName() + " thread sets value " + value);

		this.value = value;
	}

	public int getValue() {

		System.out.println(Thread.currentThread().getName() + " thread reads value " + value);

		return this.value;
	}

}
