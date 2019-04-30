package writefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {
	/**
     * This class shows how to write file in java
     * @param args
     * @throws IOException 
     */
	public static void main(String[] args) {
		String data = "I will write this String to File in Java";
		int noOfLines = 10000;
		writeUsingFileWriter(data);    
//		writeUsingBufferedWriter(data, noOfLines);    
//		writeUsingFiles(data);    
//		writeUsingOutputStream(data);
		System.out.println("File written");
	}
	
	private static void writeUsingFileWriter(String data) {
		try {
			Files.write(Paths.get("D:\\Workspace\\CoreJava\\TestFile01.txt"), data.getBytes());
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
