package thread;

public class Consumer implements Runnable{
	CountIncrease ci;
	
	public Consumer(CountIncrease ci) {
		this.ci=ci;
		Thread t = new Thread(this,"ComsumerThread");
		t.start();
 	}
	public void run() {
		while(true) {
			ci.getNum();
			try {			Thread.sleep(500);		} catch (InterruptedException e) {			e.printStackTrace();		}
		}
	}
}
