package com.lookcapp.singleton;

public class Main2 extends Thread {
	public static void main(String[] args) {
		System.out.println("Start.");
		new Main2("A").start();
		new Main2("B").start();
		new Main2("C").start();
		new Main2("D").start();
		System.out.println("End.");
	}
	@Override
	public void run() {
		Singleton2 obj = Singleton2.getInstance();
		System.out.println(getName() + ": obj = " + obj);
		super.run();
	}
	public Main2(String name) {
		super(name);
	}
}
