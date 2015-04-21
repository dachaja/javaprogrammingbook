package com.hookey.proxy;

public class Main {
	public static void main(String[] args) {
		Printable p;
		//p = new PrinterProxy("Alice");
		p = new PrinterProxy("Alice", "com.hookey.proxy.Printer");
		System.out.println("Current name is " + p.getPrinterName() + ".");
		p.setPrinterName("Bob");
		System.out.println("Current name is " + p.getPrinterName() + ".");
		p.print("Hello, world.");
	}
}
