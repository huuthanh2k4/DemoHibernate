package habernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	
	static {
		StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources source = new MetadataSources(reg);
		Metadata metadata = source.getMetadataBuilder().build();
		sessionFactory = metadata.getSessionFactoryBuilder().build();
	}
	
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
