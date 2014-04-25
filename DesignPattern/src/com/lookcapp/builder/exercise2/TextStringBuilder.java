package com.lookcapp.builder.exercise2;

public class TextStringBuilder extends Builder{
	private String buffer = "";
	
	@Override
	protected void buildTitle(String title) {
		buffer += "========================\n";
		buffer += "<" + title + ">\n";
		buffer += "\n";
	}

	@Override
	protected void buildString(String str) {
		buffer += "*" + str + "\n";
		buffer += "\n";
	}

	@Override
	protected void buildItems(String[] items) {
		for (int i = 0; i < items.length; i++) {
			buffer += " ." + items[i] + "\n";
		}
		buffer += "\n";
	}

	@Override
	protected void buildDone() {
		buffer += "=========================\n";
	}
	
	public String getResult() {
		return buffer;
	}

}
