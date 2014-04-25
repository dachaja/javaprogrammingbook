package chapter16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		try {
			listener = new ServerSocket(9999);
			socket = listener.accept();
			System.out.println("connected");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String inputMessage;
			while (true) {
				inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye"))
					break;
				
				System.out.println(inputMessage);
				String outputMessage = stin.readLine();
				out.write("server>> " + outputMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				listener.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
