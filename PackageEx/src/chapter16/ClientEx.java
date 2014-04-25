package chapter16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String outputMessage;
			while (true) {
				outputMessage = stin.readLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage);
					out.flush();
					break;
				}
				
				out.write("client>> " + outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println(inputMessage);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
