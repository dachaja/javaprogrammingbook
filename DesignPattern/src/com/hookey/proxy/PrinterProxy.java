package com.hookey.proxy;

public class PrinterProxy implements Printable{
	private String name;
//	private Printer real;
	private Printable real;
	private String className;
	
	public PrinterProxy() {
		
	}
	public PrinterProxy(String name) {
		this.name = name;
	}
	public PrinterProxy(String name, String className) {
		this.name = name;
		this.className = className;
	}
	@Override
	public synchronized void setPrinterName(String name) {
		if(real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}
	
	private synchronized void realize() {
//		if(real == null) {
//			real = new Printer(name); 
//		}
		
		if(real == null) {
			try {
				real = (Printable)Class.forName(className).newInstance();
				real.setPrinterName(name);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("Class " + className + "  not found.");
				e.printStackTrace();
			}
		}
	}

}
