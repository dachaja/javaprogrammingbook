package chapter7;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		
		System.out.println("Element size of vector: " + v.size());
		System.out.println("Capacity of vector: " + v.capacity());
		
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		
		System.out.println("Total sum in vector: " + sum);
	}
}
