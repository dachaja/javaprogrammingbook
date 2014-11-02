package com.lookcapp.visitor;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi", 100000));
			bindir.add(new File("latex", 200000));
			rootdir.accept(new ListVisitor());
			
			System.out.println(" ");
			System.out.println("Making user entries...");
			Directory Kim = new Directory("Kim");
			Directory Lee = new Directory("Lee");
			Directory Park = new Directory("Park");
			usrdir.add(Kim);
			usrdir.add(Lee);
			usrdir.add(Park);
			Kim.add(new File("diary.html", 100));
			Kim.add(new File("Composite.java", 200));
			Lee.add(new File("memo.tex", 300));
			Lee.add(new File("index.html", 350));
			Park.add(new File("game.doc", 400));
			Park.add(new File("junk.mail", 500));
			
			FileFindVisitor ffv = new FileFindVisitor(".html");
			rootdir.accept(ffv);
			
			System.out.println("HTML files are:");
			Iterator<Entry> it = ffv.getFoundFiles();
			while(it.hasNext()) {
				File file = (File) it.next();
				System.out.println(file.toString());
			}
			
			rootdir.accept(new ListVisitor());
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}

}
