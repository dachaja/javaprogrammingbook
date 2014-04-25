package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("한홍진", 97);
		javaScore.put("황기태", 34);
		javaScore.put("이영희", 98);
		javaScore.put("정원석", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("Total of HashMap elements : " + javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
