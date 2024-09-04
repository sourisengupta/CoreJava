/*POJO in Java stands for Plain Old Java Object. It is an ordinary object, which is not bound by any special restriction. 
 * The POJO file does not require any special classpath. It increases the readability & re-usability of a Java program.
 * POJOs are now widely accepted due to their easy maintenance.
 * 
 * 
 * Properties:- 
 * ---------------------------------------
 *# The POJO class must be public.
 *# It must have a public default constructor.
 *# It may have the arguments constructor.
 *# All objects must have some public Getters and Setters to access the object values by other Java Programs.
 *# The object in the POJO Class can have any access modifies such as private, public, protected. But, all instance variables should be private for improved security of the project.
 *# A POJO class should not extend predefined classes.
 *# It should not implement prespecified interfaces.
 *# It should not have any prespecified annotation.
*/
package Abstract;

public class PojoExample {
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}	
}
