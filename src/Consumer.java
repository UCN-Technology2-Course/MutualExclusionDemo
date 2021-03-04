
public class Consumer extends Thread {

	private Buffer storage;
	
	// Constructor
	public Consumer(Buffer buffer) {
		super("Consumer");

		this.storage = buffer;
	}

	@Override
	public void run() {

		int sum = 0;
		
		System.out.println("Start consuming values");
		
		for (int i = 0; i < 4; i++) {
			
			try {

				int res = this.storage.getValue();
				System.out.println("Consumed value " + res);
				sum += res;

			} catch (InterruptedException e) {

				e.printStackTrace();
			}						
		}		
		System.out.println("Done consuming values, total sum: " + sum);
	}
}
