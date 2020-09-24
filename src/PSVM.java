import java.util.Scanner;

public class PSVM  {
	
	public static String welcomeMessage = "Welcome to Datex Shipping Management System !";
	public static void main(String args[]){
		
		// fill the code
		displayClientMessage();
	}

    public static void displayClientMessage(){
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name");
        //String name = System.console().readLine();
        String name = scanner.nextLine();
        System.out.print("Hello "+name+"! Get access to the unique shipping! ");
    }
    public static void displayMessage(){
        System.out.print(welcomeMessage);
    }
}