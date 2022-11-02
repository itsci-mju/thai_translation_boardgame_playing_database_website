package util;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.Login;
import bean.LoginMember;
import bean.Member;
import manager.RegisterManager;

public class runtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SessionFactory sessionFactory = HibernateConnection.doHibernateConnection();
		
		Session session =  sessionFactory.openSession();
		
		Transaction t =session.beginTransaction();
		LocalDate date = LocalDate.of(2020, 1, 8);
		Member mb = new Member("omezainw00","1234",date,"0808080808","asdsad@gmail.com","1.jpg","1","1");
	//	session.save(mb);
	//	Member m = session.get(Member.class, 2);
		Login lg = new Login(new LoginMember("omezainw00",mb),"1234","admin");
		session.saveOrUpdate(lg);
		
		t.commit();
	
		
		System.out.println(session);
		session.close();
		sessionFactory.close();
	}

}
