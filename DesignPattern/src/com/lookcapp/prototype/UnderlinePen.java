package com.lookcapp.prototype;

import com.lookcapp.prototype.framework.ConcreateProduct;

//public class UnderlinePen implements Product{
public class UnderlinePen extends ConcreateProduct {
	private char ulchar;
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}
	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println(" ");
	}

	/*@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}*/

}
