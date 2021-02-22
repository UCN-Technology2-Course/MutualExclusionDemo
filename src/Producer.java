
public class Producer extends Thread {

	private Bufferable storage;

	// Constructor
	public Producer(Bufferable buffer) {
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

				this.storage.setValue(v);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			total += v;
		}
		System.out.println("Done producing values that sums to: " + total);
	}
}
