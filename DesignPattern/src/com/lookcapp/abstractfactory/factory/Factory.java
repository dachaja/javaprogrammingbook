package com.lookcapp.abstractfactory.factory;

public abstract class Factory {
	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 " + classname + " 이 발견되지 않습니다.");
			e.printStackTrace();
		}
		return factory;
	}
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
	public Page createYahooPage() {
		Link link = createLink("Yahoo!", "http://www.yahoo.com/");
		Page page = createPage("Yahoo!", "Yahoo!");
		page.add(link);
		
		return page;
	}
}
