package writefile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteFile {
	/**
     * This class shows how to write file in java
     * @param args
	 * @throws FileNotFoundException 
     * @throws IOException 
     */
	public static void main(String[] args) throws FileNotFoundException {
		String data = "I will write this String to File in Java";
		int noOfLines = 10000;
		writeUsingFileWriter(data);    
//		writeUsingBufferedWriter(data, noOfLines);    
//		writeUsingFiles(data);    
//		writeUsingOutputStream(data);
		System.out.println("File written");
		
		readUsingScanner();
	}
	
	// Write File using File class
	private static void writeUsingFileWriter(String data) {
		try {
			Files.write(Paths.get("D:\\Workspace\\CoreJava\\TestFile01.txt"), data.getBytes());
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	private static void readUsingScanner() throws FileNotFoundException {
		File file = new File("D:\\Workspace\\CoreJava\\TestFile01.txt");
		Scanner sc= new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
	}
	
}
