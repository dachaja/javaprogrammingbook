package chapter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter8/test.out");
			FileInputStream fin = null;
			for (int i = 0; i < 10; i++) {
				int n = 10 - i;
				fout.write(n);
			}
			fout.close();
			fin = new FileInputStream("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter8/test.out");
			
			int c=0;
			while((c=fin.read()) != -1) {
				System.out.println(c + " ");
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
