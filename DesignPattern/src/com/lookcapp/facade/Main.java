package com.lookcapp.facade;

import com.lookcapp.facade.pagemaker.PageMaker;

public class Main {
	public static void main(String[] args) {
		PageMaker.makeWelcomePage("youngjin@youngjin.com", "welcome.html");
		
		PageMaker.makeLinkPage("linkpage.html");
	}
}
