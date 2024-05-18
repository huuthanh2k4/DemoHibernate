package test;

import dao.impl.BookTypeDAOImpl;
import entities.BookType;

public class TestInsertBookType {
	public static void main(String[] args) {
		BookType bt = new BookType();
		bt.setTypeId("tt");
		bt.setTypeName("Truyện tranh");
		bt.setActive(1);
		
		boolean bl = new BookTypeDAOImpl().insertBookType(bt);
		if (bl) {
			System.out.println("Insert thành công");
		}else {
			System.out.println("Insert thất bại bt !!!!!");
		}	
	}
}
 