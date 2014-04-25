package chapter16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {
	public static void main(String[] args) {
		try {
			URL aURL = new URL("http://www.daum.net");
			URLConnection uc = aURL.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}
