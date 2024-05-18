package dao;

import java.util.List;

import entities.Book;

public interface BookDAO {
	public  List<Book>getBook();
	public boolean insertBook(Book b);
	public boolean updateBook(Book b);
	public boolean dateleBook(Integer bookId);
	public Book getBookById(Integer bookId);
	public List<Book> getBooksByName(String bookName);

}
