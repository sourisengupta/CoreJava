package methodoverriding;

/*
 * 1. In Method Overriding, the subclass has the same method with the same name and exactly the same number and type of parameters and same return type as a superclass.
 * 2. Method Overriding is to “Change” existing behavior of the method.
 * 3. It is a run time polymorphism.
 * 4. The methods must have the same signature.
 * 5. It always requires inheritance in Method Overriding.
*/
public class Main {
	
	public static void main(String args[]) {
		
		Car obC = new Car();
		obC.run();
		obC = new Audi();
		obC.run();
	}
	
}
