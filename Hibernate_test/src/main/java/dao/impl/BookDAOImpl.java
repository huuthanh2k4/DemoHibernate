package dao.impl;

import java.util.List;

import org.hibernate.Session;

import dao.BookDAO;
import entities.Book;
import habernateUtil.HibernateUtil;

public class BookDAOImpl implements BookDAO {

	@Override
	public List<Book> getBook() {
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			List list = session.createQuery("from Book").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public boolean insertBook(Book b) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			session.beginTransaction();
			session.save(b);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}

	@Override
	public boolean updateBook(Book b) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			session.beginTransaction();
			session.update(b);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}

	@Override
	public boolean dateleBook(Integer bookId) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			session.beginTransaction();
			session.delete(getBookById(bookId));
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}

	@Override
	public Book getBookById(Integer bookId) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			Book book = session.get(Book.class, bookId);
			return book;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.clear();
		}
		return null;
	}

	@Override
	public List<Book> getBooksByName(String bookName) {
		if (bookName==null || bookName.length()==0) {
			bookName = "%";
		}else {
			bookName = "%"+bookName+"%";
		}
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			session.createQuery("from Book where BookName like : bookName")
			.setParameter("bookName", bookName)
			.list(); 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

}
