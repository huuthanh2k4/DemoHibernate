package dao.impl;

import java.util.List;

import org.hibernate.Session;

import dao.BookTypeDAO;
import entities.BookType;
import habernateUtil.HibernateUtil;

public class BookTypeDAOImpl implements BookTypeDAO {

	@Override
	public List<BookType> getListBookTypes() {
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			List list = session.createQuery("from BookType").list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public boolean insertBookType(BookType bt) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			session.beginTransaction();
			session.save(bt);
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

}
