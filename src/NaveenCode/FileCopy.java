package NaveenCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String args[]) {
	
		copyFile();
		
	}
	public static void copyFile() {
		File inpFile = new File("C:\\Users\\souri\\Downloads\\NABANITA DAS DIGIT.pdf");
	File outFile = new File("C:\\Users\\souri\\Downloads\\NABANITA DAS DIGIT-copy.pdf");
	
	FileInputStream fileInputStream = null;
	FileOutputStream fileOutputStream = null;
	
	try {
		fileInputStream = new FileInputStream(inpFile);
		fileOutputStream = new FileOutputStream(outFile);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	int i=0;
	try {
		while((i = fileInputStream.read()) != -1) {
			fileOutputStream.write(i);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(fileInputStream != null) {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(fileOutputStream != null) {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	}
	
}
