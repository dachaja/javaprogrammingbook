package com.lookcapp.composite3;

import java.util.ArrayList;

import javax.json.JsonArrayBuilder;

public class Main {
	public static void main(String[] args) {
		ArrayList<Category> arr = new ArrayList<Category>();
		
		Category cg = new Category("mostupdated");
		arr.add(cg);
		Category cg1 = new Category("mostviewed");
		arr.add(cg1);
		Category cg2 = new Category("manual");
		arr.add(cg2);
		
		Category cg3 = new Category("toy");
		cg2.add(cg3);
		cg3.add(new Category("lego"));
		Category cg4 = new Category("furniture");
		cg2.add(cg4);
		
		for (Category category : arr) {
			category.toString();
		}
		
	}
}
