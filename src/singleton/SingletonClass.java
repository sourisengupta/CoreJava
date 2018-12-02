package singleton;

public class SingletonClass {
	
	public static SingletonClass ob1;
	
	private SingletonClass() {
		System.out.println("Constructor called");
	}
	
	public static synchronized SingletonClass getInstance() { // Making the method synchronized will make the performance poor
															  // Will overcome with double checked locking
		if(ob1 == null) {
			
			synchronized(SingletonClass.class) {		//double checked locking
				if(ob1 == null) {
					ob1 = new SingletonClass();	//calling in the method made this lazy
				}
				
			}
		}
		return ob1;
	}
	
}
