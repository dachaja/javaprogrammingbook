package com.lookcapp.prototype;

import com.lookcapp.prototype.framework.ConcreateProduct;

//public class MessageBox implements Product{
public class MessageBox extends ConcreateProduct {
	private char decochar;
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
	
	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}
}
