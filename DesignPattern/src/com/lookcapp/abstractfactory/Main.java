package com.lookcapp.abstractfactory;

import com.lookcapp.abstractfactory.factory.Factory;
import com.lookcapp.abstractfactory.factory.Link;
import com.lookcapp.abstractfactory.factory.Page;
import com.lookcapp.abstractfactory.factory.Tray;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Uage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main com.lookcapp.abstractfactory.listfactory.ListFactory");
			System.out.println("Example 2: java Main com.lookcapp.abstractfactory.tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
		
		Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("Newspaper");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(kr_yahoo);
		
		Tray traysearch = factory.createTray("Search Engine");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "YoungGin.com");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
}
