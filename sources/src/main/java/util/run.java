package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import manager.RegisterManager;
import util.HibernateConnection;

public class run {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConnection.doHibernateConnection();
		
		Session session =  sessionFactory.openSession();
		
		Transaction t =session.beginTransaction();
		
		RegisterManager mg = new RegisterManager();
		
		System.out.println(session);

	}

}
