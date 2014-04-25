package chapter8;

import java.io.File;

public class FileClassExample {
	public static void dir(File fd) {
		String[] filenames = fd.list();
		
		for(String s : filenames) {
			File f = new File(fd,s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t파일 크기: " + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}
	public static void main(String[] args) {
		File f1 = new File("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/chapter8/test.out");
		File f2 = new File("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/java_sample");
		File f3 = new File("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src");
		
		String res;
		if(f1.isFile()) {
			res = "file";
		} else {
			res = "directory";
		}
		
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		if(!f2.exists()) {
			if(!f2.mkdir()) {
				System.out.println("failed to make directory.");
			}
		}
		
		if(f2.isFile()) {
			res = "file";
		} else {
			res = "directory";
		}
		System.out.println(f2.getPath() + "은 " + res + "입니다.");
		dir(f3);
		f2.renameTo(new File("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/PackageEx/src/javasample"));
		
		dir(f3);
	}
}	
