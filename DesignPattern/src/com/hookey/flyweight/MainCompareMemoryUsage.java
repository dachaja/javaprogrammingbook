package com.hookey.flyweight;

public class MainCompareMemoryUsage {
	private static BigString[] bsarray = new BigString[1000];
	
	public static void main(String[] args) {
		System.out.println("Shared: ");
		testAllocation(true);
		System.out.println("Unshared: ");
		testAllocation(false);
	}
	
	public static void testAllocation(boolean shared) {
		for (int i = 0; i < bsarray.length; i++) {
			bsarray[i] = new BigString("1212123", shared);
		}
		showMemory();
	}
	
	public static void showMemory() {
		Runtime.getRuntime().gc();
		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Memory Usage: " + used);
	}
}
