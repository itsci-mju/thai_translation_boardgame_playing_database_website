package manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.*;
import util.HibernateConnection;

public class RegisterManager {
	
	public String doSignUp(Member m) {
		String result = null;
		SessionFactory sessionFactory = HibernateConnection.doHibernateConnection();
		Session session =  sessionFactory.openSession();
		Transaction t =session.beginTransaction();
		try {
			session.save(m);
			result ="success";
		}catch(Exception e) {
			e.printStackTrace();
			result="fail";
		}
		t.commit();
		session.close();
		sessionFactory.close();
		
		return result;
	}

}
