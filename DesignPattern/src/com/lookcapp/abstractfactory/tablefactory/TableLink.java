package com.lookcapp.abstractfactory.tablefactory;

import com.lookcapp.abstractfactory.factory.Link;

public class TableLink extends Link{

	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
	}

}
