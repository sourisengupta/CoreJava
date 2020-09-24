package thread;

public class CountIncrease {
	int num;
	boolean flag = false;
	public synchronized void setNum(int num) {
		while(flag) {
			try {				wait();			} catch (InterruptedException e) {				e.printStackTrace();			}
		}
		System.out.println("Put: "+num);
		this.num=num;
		flag=true;
		notify();
	}
	public synchronized void getNum() {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get: "+num);
		flag=false;
		notify();
	}
}
