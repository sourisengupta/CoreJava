package thread;

public class Producer implements Runnable{
	CountIncrease ci;
	public Producer(CountIncrease ci) {
		this.ci=ci;
		Thread t = new Thread(this,"ProducerThread");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			ci.setNum(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
