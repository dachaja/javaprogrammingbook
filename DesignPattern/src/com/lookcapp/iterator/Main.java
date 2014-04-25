package com.lookcapp.iterator;

public class Main {

	public static void main(String[] args) {
		//BookShelf bookShelf = new BookShelf(4);
		BookShelfArrayList bookShelf = new BookShelfArrayList();
		
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("Eddie"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}

}
