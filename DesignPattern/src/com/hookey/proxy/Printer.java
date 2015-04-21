package com.hookey.proxy;

public class Printer implements Printable{
	private String name;
	public Printer() {
		heavyJob("Create Printer instance.");
	}
	public Printer(String name) {
		this.name = name;
		heavyJob("Create (" + name + ") Printer instance.");
	}
	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}
	@Override
	public String getPrinterName() {
		return name;
	}
	@Override
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}
	
	private void heavyJob(String msg) {
		System.out.println(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(".");
		}
		System.out.println("End.");
	}
}
