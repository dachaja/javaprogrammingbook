package chapter8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter8/test.rtf");
			while((c=in.read()) != 10) {
				fout.write(c);
				System.out.println(c);
			}
			
			in.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
