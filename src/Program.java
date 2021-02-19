
public class Program {

	public static void main(String[] args) {

		Buffer sharedStorage = new Buffer();
		
		Producer producer = new Producer(sharedStorage);
		Consumer consumer = new Consumer(sharedStorage);
		
		producer.start();
		consumer.start();
	}

}
