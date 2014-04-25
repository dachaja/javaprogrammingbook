package chapter16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLRead {
	public static void main(String[] args) {
		URL aURL;
		try {
			aURL = new URL("http://www.nate.com");
		
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
			String inputLine;
			
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
