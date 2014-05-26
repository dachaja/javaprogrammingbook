package com.lookcapp.decorator;

public class Main {
	public static void main(String[] args) {
		Display b1 = new StringDisplay("Hello, world.");
		Display b2 = new SideBorder(b1, '#');
		Display b3 = new FullBorder(b2);
		b1.show();
		b2.show();
		b3.show();
		
		Display b4 = new SideBorder(
				new FullBorder(
						new FullBorder(
								new SideBorder(
										new FullBorder(
												new StringDisplay("안녕하세요.")
												), 
												'*'
											)
									)
							),
						'/');
		b4.show();
		
		//----Exercise 12-1
		Display e1 = new StringDisplay("Hello, world.");
		Display e2 = new UpDownBorder(b1, '-');
		Display e3 = new SideBorder(b2, '*');
		e1.show();
		e2.show();
		e3.show();
		
		Display e4 = new FullBorder(
				new UpDownBorder(
						new SideBorder(
								new UpDownBorder(
										new SideBorder(
												new StringDisplay("안녕하세요.") , 
												'*'), 
												'='),
												'|'),
												'/')
				);
		e4.show();
		
		//---Exercise 12-2
		MultiStringDisplay md = new MultiStringDisplay();
		md.add("좋은 아침입니다.");
		md.add("안녕하세요.");
		md.add("안녕히 주무세요. 내일 만나요.");
		md.show();
		
		Display f1 = new SideBorder(md, '#');
		f1.show();
		
		Display f2 = new FullBorder(md);
		f2.show();
	}
}
