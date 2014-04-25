package com.lookcapp.abstractfactory;

import com.lookcapp.abstractfactory.factory.Factory;
import com.lookcapp.abstractfactory.factory.Page;

public class MainExercise2 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Uage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main com.lookcapp.abstractfactory.listfactory.ListFactory");
			System.out.println("Example 2: java Main com.lookcapp.abstractfactory.tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
		
		Page page = factory.createYahooPage();
		page.output();
	}
}
