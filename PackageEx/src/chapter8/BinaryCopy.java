package chapter8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("/Users/adokalways/Desktop/4310644647_9256c37c0c_o.png");
		File dst = new File("/Users/adokalways/Desktop/4310644647_9256c37c0c_o.jpg");
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		
		try {
			fi = new FileInputStream(src);
			fo = new FileOutputStream(dst);
			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo);
			while((c=in.read())!=-1) {
				out.write(c);
			}
			
			in.close();
			out.close();
			fi.close();
			fo.close();
			
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
