package thread;

public class InterThread {
	public static void main(String[] args) {
		CountIncrease ci = new CountIncrease();
		new Producer(ci);
		new Consumer(ci);
		
	}
}
