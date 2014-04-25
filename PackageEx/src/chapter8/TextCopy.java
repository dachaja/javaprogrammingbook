package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {
	public static void main(String[] args) {
		File src = new File("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter8/test.out");
		File dst = new File("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter7/test.out");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		int c;
		
		try {
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while((c=in.read())!= -1) {
				out.write((char)c);
			}
			in.close();
			out.close(); 
			fr.close();
			fw.close();
			
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
