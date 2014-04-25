package chapter16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionWriter {
	public static void main(String[] args) {
		URL aURL;
		try {
			aURL = new URL("http://httpbin.org/post");
			URLConnection uc = aURL.openConnection();
			uc.setDoOutput(true);
			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());
			
			out.write("Firstname=Kitae&Lastname=Hwang");
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			
			String inputLine;
			while ((inputLine=in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
