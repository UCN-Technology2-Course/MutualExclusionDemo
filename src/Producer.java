
public class Producer extends Thread {

	private Buffer storage;

	// Constructor
	public Producer(Buffer buffer) {
		super("Producer");

		this.storage = buffer;
	}

	@Override
	public void run() {

		int total = 0;
		
		System.out.println("Start production of values");
		
		// Producing values and stores them in the buffer
		for (int v = 1; v <= 4; v++) {

			try {

				int res = this.storage.setValue(v);
				System.out.println("Produced value " + res);
				total += res;

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("Done producing values that sums to: " + total);
	}
}
