package com.lookcapp.adapter;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
		
		PrintBanner pb = new PrintBanner("Hello2");
		pb.printWeak();
		pb.printStrong();
		
		// exercise 2
		FileIO f = new FileProperties();
		try {
			f.readFromFile("/Users/adokalways/Documents/Projects/study/javaprogrammingbook/DesignPattern/src/com/lookcapp/adapter/file.rtf");
			f.setValue("year", "2014");
			f.setValue("month", "4");
			f.setValue("day", "10");
			f.writeToFile("newfile2.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
