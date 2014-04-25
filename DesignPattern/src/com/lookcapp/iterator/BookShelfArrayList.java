package com.lookcapp.iterator;

import java.util.ArrayList;

public class BookShelfArrayList implements Aggregate {
	private ArrayList<Book> books;
	
	public BookShelfArrayList() {
		this.books = new ArrayList<>();
	}
	public Book getBookAt(int index) {
		return books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
	}
	public int getLength() {
		return this.books.size();
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIteratorAL(this);
	}

}
