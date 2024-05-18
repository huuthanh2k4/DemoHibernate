package dao.impl;

import java.util.List;

import org.hibernate.Session;

import dao.PublisherDAO;
import entities.publisher;
import habernateUtil.HibernateUtil;

public class PublisherDAOimpl implements PublisherDAO{

	@Override
	public List<publisher> getpuPublishers() {
		Session session = HibernateUtil.getSessionfactory().openSession();
		
		try {
			List list = session.createQuery("from Publisher").list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public boolean insertPublisher(publisher pub) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		try {
			session.beginTransaction();
			session.save(pub);
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

}
