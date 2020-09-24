import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		String invNumber, custNumber = null, agNumber = null,compNumber=null,startPort,endPort;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the invoice number:");
		
		invNumber = br.readLine();	
		
		if(invNumber.indexOf("AT")>0) {
			custNumber = invNumber.substring(2, invNumber.indexOf("AT"));
			agNumber = invNumber.substring(invNumber.indexOf("AT")+2, invNumber.indexOf("S"));
			System.out.println("Customer number:"+custNumber);
			System.out.println("Agent number:"+agNumber);
			
			
		}
		else if(invNumber.indexOf("CY")>0) {
			custNumber = invNumber.substring(2, invNumber.indexOf("CY"));
			compNumber = invNumber.substring(invNumber.indexOf("CY")+2, invNumber.indexOf("S"));
			System.out.println("Customer number:"+custNumber);
			System.out.println("Company number:"+compNumber);
			
		}
		startPort = invNumber.substring(invNumber.indexOf("S")+1,invNumber.indexOf("E"));
		endPort = invNumber.substring(invNumber.indexOf("E")+1,invNumber.length());
		System.out.println("Starting port:"+startPort);
		System.out.println("Ending port:"+endPort);
	}
}
