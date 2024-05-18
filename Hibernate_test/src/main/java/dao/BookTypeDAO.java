package dao;

import java.util.List; 

import entities.BookType;

public interface BookTypeDAO {
	public List<BookType> getListBookTypes();
	public boolean insertBookType(BookType bt);
	
	

}
