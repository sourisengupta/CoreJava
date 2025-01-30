package InterviewProblems;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
// https://www.tutorialspoint.com/pdfbox/pdfbox_adding_pages.htm
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PdfUtility {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createPdfDocument();
		
		
	}
	
	public static void createPdfDocument() throws IOException {
		PDDocument doc = new PDDocument();
		PDPage page = new PDPage();
		doc.addPage(page);
		
		PDDocumentInformation pdd = doc.getDocumentInformation();
		
		pdd.setTitle("New Title");
		pdd.setAuthor("Souri Sengupta");
		pdd.setSubject("Example Subject");
		
		Calendar date = new GregorianCalendar();
		date.set(2010,1,1);
		pdd.setCreationDate(date);
		
		doc.save("D:\\Workspace\\CoreJava\\test_01.pdf");
		System.out.println("PDF created");  
	    
	      //Closing the document  
		doc.close();
		
		//Adding text
		File file = new File("D:\\Workspace\\CoreJava\\test_01.pdf");
	    PDDocument document = PDDocument.load(file);
		
		PDPage page1 = document.getPage(0);		
		PDPageContentStream contentStream = new PDPageContentStream(document, page1);
		
		contentStream.beginText();		
		contentStream.setFont(PDType1Font.COURIER,12);
		contentStream.newLineAtOffset(25, 500);
		String str="This is a PDF creatiuon test";
		contentStream.showText(str);
		contentStream.endText();
		
		System.out.println("Content added");

		doc.close();
		
		
	}
	
	
}
