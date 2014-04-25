package com.lookcapp.abstractfactory.listfactory;

import com.lookcapp.abstractfactory.factory.Factory;
import com.lookcapp.abstractfactory.factory.Link;
import com.lookcapp.abstractfactory.factory.Page;
import com.lookcapp.abstractfactory.factory.Tray;

public class ListFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
