package com.lookcapp.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
	private PageMaker() { }
	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + "'s page!");
			writer.paragraph(username + "'s page.");
			writer.paragraph("Waiting for mail...");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void makeLinkPage(String filename) {
		try{
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Link page");
			Properties mailprop = Database.getProperties("maildata");
			Enumeration<?> en = mailprop.propertyNames();
			while (en.hasMoreElements()) {
				String mailaddr = (String) en.nextElement();
				String username = mailprop.getProperty(mailaddr, "(unknow)");
				writer.mailto(mailaddr, username);
			}
			writer.close();
			System.out.println(filename + " is created.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
