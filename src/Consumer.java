
public class Consumer extends Thread {

	private Bufferable storage;
	
	// Constructor
	public Consumer(Bufferable buffer) {
		super("Consumer");

		this.storage = buffer;
	}

	@Override
	public void run() {

		int sum = 0;
		
		System.out.println("Start consuming values");
		
		for (int i = 0; i < 4; i++) {
			
			try {

				sum += this.storage.getValue();

			} catch (InterruptedException e) {

				e.printStackTrace();
			}						
		}		
		System.out.println("Done consuming values, total sum: " + sum);
	}
}
