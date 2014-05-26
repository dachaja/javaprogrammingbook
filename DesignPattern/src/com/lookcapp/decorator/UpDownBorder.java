package com.lookcapp.decorator;

public class UpDownBorder extends Border{
	private char updownChar;

	protected UpDownBorder(Display display, char ch) {
		super(display);
		this.updownChar = ch;
	}

	@Override
	public int getColumns() {
		return display.getColumns();
	}

	@Override
	public int getRows() {
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		if(row == 0 || row == getRows() - 1) {
			return makeLine(this.updownChar, getColumns());
		} else {
			return display.getRowText(row-1);
		}
	}
	
	private String makeLine(char ch, int count) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}
		return buf.toString();
	}

}
