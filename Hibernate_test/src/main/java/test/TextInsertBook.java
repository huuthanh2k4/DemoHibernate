package test;

import dao.impl.BookDAOImpl;
import entities.Book;
import entities.BookType;
import entities.publisher;

public class TextInsertBook {
	public static void main(String[] args) {
		Book b = new Book();
		b.setBookName("Truyện tranh Doraemon tập 1");
		b.setAuthor("Quên rồi");
		b.setYearPublish(2000);
		BookType bt = new BookType();
		bt.setTypeId("tt");
		publisher p = new publisher();
		p.setPubId("sdkjgb");
		b.setBookType(bt);
		b.setPublisher(p);
		b.setPages(1000);
		b.setPrice(25000D);
		
		boolean book = new BookDAOImpl().insertBook(b);
		if (book) {
			System.out.println("Insert thành công");
		}else {
			System.out.println("Insert thất bại b !!!!!");
		}

	}
 
}
