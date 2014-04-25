package com.lookcapp.builder.exercise2;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if (args[0].equals("plain")) {
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String result = htmlbuilder.getResult();
			System.out.println(result);
		} else if(args[0].equals("frame")) {
			FrameBuilder framebuilder = new FrameBuilder();
			Director director = new Director(framebuilder);
			director.construct();
			JFrame frame = framebuilder.getResult();
			frame.setSize(300, 400);
			frame.setVisible(true);
		} else if(args[0].equals("string")) {
			TextStringBuilder textstringbuilder = new TextStringBuilder();
			Director director = new Director(textstringbuilder);
			director.construct();
			String result = textstringbuilder.getResult();
			System.out.println(result);
		} else {
			usage();
			System.exit(0);
		}
	}
	
	public static void usage() {
		System.out.println("Usage: java Main plain 일반 텍스트로 문서작성");
		System.out.println("Usage: java Main html HTML 파일로 문서작성");
		System.out.println("Usage: java Main frame Frame로 문서작성");
	}
}
