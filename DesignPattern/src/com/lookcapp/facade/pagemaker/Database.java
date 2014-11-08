package com.lookcapp.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {
	private Database() { }
	public static Properties getProperties(String dbname) {
		String filename = "/Users/adokalways/Documents/Projects/study/javaprogrammingbook/DesignPattern/src/com/lookcapp/facade/pagemaker/" + dbname + ".txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		} catch (IOException e) {
			System.out.println("Warning: " + filename + " is not found.");
		}
		return prop;
	}
}
