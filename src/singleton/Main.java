package singleton;

public class Main {
	
	public static void main(String args[]) {
		
		SingletonClass ob2 = SingletonClass.getInstance();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				SingletonClass ob1 = SingletonClass.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				SingletonClass ob1 = SingletonClass.getInstance();
			}
		});
		t1.start();
		t2.start();
	}
	
}
