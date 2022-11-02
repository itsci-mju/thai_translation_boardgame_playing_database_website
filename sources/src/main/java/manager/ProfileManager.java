package manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.*;
import util.HibernateConnection;

public class ProfileManager {
	/*
	 * public int getIdByEmail(String email) { session = sessionFact.openSession();
	 * Query query = session.
	 * createQuery("SELECT u.user_id FROM tbl_user u WHERE u.email=:emailParam");
	 * query.setParameter("emailParam", email); return (int) query.uniqueResult(); }
	 * 
	 * 
	 * public String getProfile(Member m) { String result = null; SessionFactory
	 * sessionFactory = HibernateConnection.doHibernateConnection(); Session session
	 * = sessionFactory.openSession(); try { String sql
	 * ="call getLoginStatus('"+m.getLgmb().getUsername()+"','"+m.getPassword()+
	 * "')"; result = session.createSQLQuery(sql).uniqueResult().toString();
	 * }catch(Exception e) { e.printStackTrace(); }finally { session.close();
	 * sessionFactory.close(); }
	 * 
	 * return result;
	 * 
	 * 
	 * }
	 */
	public int editprofile(Member editmember) {
	    int Resutl = 0;
	     try {
	            SessionFactory sessionFactory = HibernateConnection.doHibernateConnection();
	            Session session = sessionFactory.openSession();
	            Transaction t = session.beginTransaction();
	            session.update(editmember);

	            t.commit();
	            session.close();
	            Resutl = 1;
	        } catch (Exception e) {
	            e.printStackTrace();
	            Resutl = 0;
	        }
	        return Resutl;
	}
	

}
