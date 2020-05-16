package com.automation.appium.Test;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class PDFBox {
	
	public static void main(String[] args)throws IOException {  
		
		PDDocument doc = new PDDocument();
		doc.save("C:\\Users\\kamlesh.maurya\\Desktop\\me\\test.pdf");
		doc.close();
		
	}

}
