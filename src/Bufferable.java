
public interface Bufferable {
	void setValue(int value) throws InterruptedException;
	int getValue() throws InterruptedException;
}
