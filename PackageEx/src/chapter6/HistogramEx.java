package chapter6;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HistogramEx {
	private static HashMap<String, Integer> charHistogram;
	
	public static void main(String[] args) {
		charHistogram = new HashMap<>();
		InputStreamReader rd = new InputStreamReader(System.in);
		try{
			while(true){
				int c = rd.read();
				if(c==48) //ctrl-z is -1
					break;
				increaseCharNum(String.valueOf((char)c).toLowerCase());
				//System.out.print((char)c);	
			}
		} catch(IOException e) {
			System.out.println("Input Error.");
		}
		
		//Draw Histogram.
		System.out.println("Draw Histogram.");
		
		drawLines();
		
	}

	private static void drawLines() {
		String[] letters = {"A","B","C","D","E","F","G",
				"H","I","J","K","L","M","N","O","P","Q",
				"R","S","T","U","V","W","X","Y","Z"};
		System.out.println("A");
	}

	private static void increaseCharNum(String c) {
		if(c.trim().isEmpty())
			return;
		
		if(charHistogram.get(c) == null) {
			charHistogram.put(c, 1);
		} else {
			charHistogram.put(c, charHistogram.get(c)+1);
		}
		
		//System.out.println(charHistogram.get(c) + " / " + c);
	}
}
