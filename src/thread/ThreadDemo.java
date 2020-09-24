package thread;

public class ThreadDemo {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Thread t1 =new Thread(() -> {
			for(int i=0;i<5;i++) {
				System.out.println("Hi");
			}
		},"souri1");
		Thread t2 =new Thread(() -> {
			for(int i=0;i<5;i++) {
				System.out.println("Hello");
			}
		},"souri2");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("End");
	}
}
