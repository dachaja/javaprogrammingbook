package com.lookcapp.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor{
	private String filetype;
	private ArrayList<Entry> found = new ArrayList<Entry>();
	
	public FileFindVisitor(String filetype) {
		this.filetype = filetype;
	}
	public Iterator<Entry> getFoundFiles() {
		return found.iterator();
	}

	@Override
	public void visit(File file) {
		if(file.getName().endsWith(filetype)) {
			found.add(file);
		}
	}

	@Override
	public void visit(Directory directory) {
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = it.next();
			entry.accept(this);
		}
	}
}
