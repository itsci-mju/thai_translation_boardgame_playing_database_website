package manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Login;
import bean.Member;
import util.HibernateConnection;

public class LoginManager {
	
	public String verifyLogin(Login l) {
		String result = null;
		SessionFactory sessionFactory = HibernateConnection.doHibernateConnection();
		Session session =  sessionFactory.openSession();
		try {
		String sql ="call getLoginStatus('"+l.getLgmb().getUsername()+"','"+l.getPassword()+"')";
		result = session.createSQLQuery(sql).uniqueResult().toString();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		return result;
		

	}
	public Login getLogin(String username) {
		Login user = null;
		SessionFactory sessionFactory = HibernateConnection.doHibernateConnection();
		Session session =  sessionFactory.openSession();
		try {
			user =session.get(Login.class, username);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		return user;
		
	}
	
	public String doSignUpLogin(Login l) {
		String result = null;
		SessionFactory sessionFactory = HibernateConnection.doHibernateConnection();
		Session session =  sessionFactory.openSession();
		Transaction t =session.beginTransaction();
		try {
			session.save(l);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			t.commit();
			session.close();
			sessionFactory.close();
		}
		
		return result;
	}
	}


