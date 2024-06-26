package iterator_2;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

	private List<Book> books;
	
	public BookShelf() {
		books = new ArrayList<Book>();
	}
	
	public int getLength() {
		return books.size();
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}
	
	@Override
	public Iterator iterator() {
		// TODO 自動生成されたメソッド・スタブ
		return new BookShelfIterator(this);
	}

}
