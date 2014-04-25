package com.lookcapp.iterator;

public class BookShelfIteratorAL implements Iterator{
	private BookShelfArrayList bookShelf;
	private int index;
	
	public BookShelfIteratorAL(BookShelfArrayList bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength())
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
