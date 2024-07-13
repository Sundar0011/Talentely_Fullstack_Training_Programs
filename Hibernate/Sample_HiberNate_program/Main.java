package HibernateBasic.HibernateBasic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class animaiMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a=new animal();
		a.setColor("blue");
		a.setName("Dog");
		Configuration configuration=new Configuration().configure().addAnnotatedClass(animal.class);
		SessionFactory sFactory=configuration.buildSessionFactory();
		Session session=sFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(a);
		transaction.commit();
	}

}
