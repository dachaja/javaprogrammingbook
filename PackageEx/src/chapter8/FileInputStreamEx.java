package chapter8;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("/Users/adokalways/Documents/document.rtf");
			int c;
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
		} catch (Exception e) {
			System.out.println("Input Error.");
		}
	}
}
