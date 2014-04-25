package chapter8;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("/Users/adokalways/Documents/document.rtf");
			
			int c;
			while ((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("IOException.");
		}
	}
}
