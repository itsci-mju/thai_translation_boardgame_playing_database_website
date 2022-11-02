package util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import bean.*;




public class HibernateConnection {
	public static SessionFactory sessionFactory;
	static String url = "jdbc:mysql://localhost:3306/project?characterEncoding=UTF-8&characterSetResults=UTF-8";
	static String uname = "root";
	static String pwd = "1234";
	
	public static SessionFactory doHibernateConnection(){
		Properties database = new Properties();
	//	database.setProperty("hibernate.hbm2ddl.auto", "create"); //สร้างตารางใหม่ ข้อมูลหาย
	    database.setProperty("hibernate.hbm2ddl.auto", "update"); //อัพเดตตาราง ข้อมูลไม่หาย
		database.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
		database.setProperty("hibernate.connection.username",uname);
		database.setProperty("hibernate.connection.password",pwd);
		database.setProperty("hibernate.connection.url",url);
		database.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5InnoDBDialect");
		Configuration cfg = new Configuration().setProperties(database)
					 		.addPackage("bean")
					 		.addAnnotatedClass(Boardgame.class)
					 		.addAnnotatedClass(Login.class)
					 		.addAnnotatedClass(Member.class)
					 		.addAnnotatedClass(Playgame.class)
					 		.addAnnotatedClass(ViewRank.class)
						;
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		sessionFactory = cfg.buildSessionFactory(ssrb.build());
		return sessionFactory;
	}
}
